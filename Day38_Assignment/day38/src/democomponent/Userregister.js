import React, { Component } from 'react'

export default class Userregister extends Component {

    constructor(props){
        super(props);
        this.state={uname:'Hello',lang:'React'}
        
        this.changeName=this.changeName.bind(this);
        this.changeLanguage=this.changeLanguage.bind(this);
        this.validateValue=this.validateValue.bind(this);
    }
changeName(event){
    this.setState({uname:event.target.value});
    // console.log(this.state.uname)
}
changeLanguage(event){
    this.setState({lang:event.target.value});
    // console.log(this.state.lang)
}
validateValue(event){
    event.preventDefault()
    alert(this.state.lang+ ' '+ this.state.uname);
    console.log(this.state.lang + " "+ this.state.uname)
    
}

  render() {
    return (
        <div>
      <div>Userregister Demo</div>
      <form onSubmit={this.validateValue }>
        <input type="text" value={this.state.uname} onChange={this.changeName}></input><br/>
        <label>Technology : </label><select value={this.state.lang} onChange={this.changeLanguage}>
            <option value="java">Java</option>
            <option selected value="React">React</option>
            <option value="angular">Angular</option>
        </select>
        <br/>
        <input type="submit" value="Register"></input>
        
      </form>
      </div>
    )
  }
}


