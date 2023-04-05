// import axios from 'axios';
import React, { useState } from 'react'
import { useFormik } from 'formik'
import { useEffect } from 'react'
import axios from "axios";

export default function Findbyusername() {
    const [data,setData] = useState([]);
    const frm = useFormik({
        initialValues: { uname: 'divyesh' },
        onSubmit: (event) => {
            // event.prevantDefault();
            console.log(frm.values.uname);
            alert(`The name you entered was: ${frm.values.uname}`);
            axios.get(`https://api.github.com/users/${frm.values.uname}`).then((response) => { setData(response.data)});
        }
    });

    useEffect(() => {
        
    }, [frm.values.uname]);

    return (
        <>
            <div>Findbyusername</div>
            <br />
            <br />
            <form onSubmit={frm.handleSubmit}>
                <label>Enter User Name : </label>
                <input type="text" id="uname" name="uname" value={frm.values.uname} onChange={frm.handleChange} placeholder="divyesh" required></input>
                <input type="submit" value="submit"></input>

            </form>
            <br />
            <hr></hr>
            <br />
            <table border={2}>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Photo</th>
                </tr>
                {data.map((sd) => {
                        <tr>
                            <td>{sd.id}</td>
                            <td>{sd.login}</td>
                            <td><img src={sd.avatar_url} ></img></td>
                        </tr>
                })}

            </table>
        </>
    )
}
