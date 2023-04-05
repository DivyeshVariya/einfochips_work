import React, { useState, useEffect } from 'react';
import axios from "axios";

export default function Viewalluser() {
    const [data, setData] = useState([]);
    
    useEffect(() => {
        axios.get("https://api.github.com/users").then((res) => { setData(res.data) });
    }, []);
    return (
        <div>
            {data.length>0&&(
                <table>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Photo</th>
                    </tr>
                    {data.map((user)=>(
                        <tr key={user.id}>
                            <td>{user.id}</td>
                            <td>{user.login}</td>
                            <td><img src={user.avatar_url} alt="imag" /></td>
                        </tr>
                    ))}
                </table>
            )
            }
        </div>

    )
}
