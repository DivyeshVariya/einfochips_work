import React from 'react'
import { useState, useEffect } from 'react'
import axios from "axios";
export default function Form() {
    const [name, setName] = useState("");
    const [errorMSg, setErrorMsg] = useState("");
    const [data, setData] = useState({});
    const handleSubmit = (event) => {
        event.preventDefault();
        console.log(name)
        alert(`The name you entered was: ${name}`);
        axios.get(`https://api.github.com/users/${name}`).then(res=>setData(res.data)).catch(error=>setErrorMsg("Sorry ! User Not Found..."))
    }
    useEffect(() => {
        
    }, [name]);

    return (
        <>
        <center>
            <form onSubmit={handleSubmit}>
                <label htmlFor="uname">Enter User Name :</label>
                <input
                    id="uname"
                    name="uname"
                    type="text"
                    onChange={(e) => setName(e.target.value)}
                    value={name}
                />

                <button type="submit">Submit</button>
            </form>
            <br />
            {errorMSg==="" &&
            
            <table>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Photo</th>
                </tr>
                <tr key={data.id}>
                    <td>{data.id}</td>
                    <td>{data.login}</td>
                    <td><img src={data.avatar_url} ></img></td>
                </tr>
            </table>
            }
            {errorMSg!=="" &&
            <div>{errorMSg}</div>}
            </center>
        </>
    )
}
