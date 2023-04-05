import { Component } from "react";

class Sample3 extends Component{
    componentDidUpdate(){
        console.log(this.state.count);
        <h3>{this.state.count}</h3>
    }
    constructor(props){
        super();
        this.state={count:0};
    }

    increment(){
        this.setState({count:this.state.count+1});
    }
    decreament(){
        this.setState({count:this.state.count-1});
    }
    render(){
        return <div>
            <h1>Welcome to session</h1>
            <h2>session date</h2>
            <button onClick={()=> this.increment()}>Need increment ?</button>
            <button onClick={()=> this.decreament()}>Need decrement ? </button>
            <h3>{this.state.count}</h3>
        </div>
    }
}
export default Sample3;