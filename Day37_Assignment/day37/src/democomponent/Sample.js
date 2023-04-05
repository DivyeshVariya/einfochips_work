import { Children } from "react";

const Example=(props)=> {
    return (<div><h1>This democomponent1 {props.name} -- {props.className} {props.children} </h1><h2>other data</h2></div>)
}
export const Example1=()=> <h1>This democomponent2</h1>
export default Example;