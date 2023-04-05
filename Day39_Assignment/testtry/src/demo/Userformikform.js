import React from 'react'
import {useFormik} from 'formik'

export default function Userformikform() {
    const frm=useFormik({
        initialValues:{
            uname:"Divyesh",
            email:"variya187@gmail.com",
            lang:"React"
        },
        onSubmit:values=>{
            console.log(frm.values);
        }
    })
  return (
    <center>
    <div>    
        <div>Userformikform</div>

        <br/>
        <form onSubmit={frm.handleSubmit}>
        User Name : <input type="text" id="uname" name="uname" value={frm.values.uname} onChange={frm.handleChange} required></input>
        <br/>
        <br/>
        Email id : <input type="email" id="email" name="email" value={frm.values.email} onChange={frm.handleChange} required></input>
        <br/>
        <br/>
        Technology :
        <select id="lang" name="lang" value={frm.values.lang} onChange={frm.handleChange} required>
            <option value="Java">Java</option>
            <option selected value="React">React</option>
            <option value="Angular">Angular</option>
        </select>
        <br/>
        <br/>
        <input type="submit" value="Register"></input>
        </form>
    </div>
    </center>

  )
}
