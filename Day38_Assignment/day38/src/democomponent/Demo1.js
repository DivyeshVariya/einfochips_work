function Demo1(){
    
    function msg(){
        console.log("You clicked....");
        
    }
    return (
        <div>
            <h2>Demo event binding</h2>
            <br/>
            <button onClick={msg}>Click me</button>
            <br/>
            <h2>You can see changes in console..</h2>
        </div>
    )
}
export default Demo1;