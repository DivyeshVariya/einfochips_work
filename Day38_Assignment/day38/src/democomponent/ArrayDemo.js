import Player from "./Player"

function ArrayDemo(){
    const players=["Virat","Dhoni","Sachine"]
    const players1=[
        {id:1,name:"Virat",country:"India",runs:123},
        {id:2,name:"Dhoni",country:"India",runs:456},
        {id:3,name:"Sachin",country:"India",runs:789}
    ]
    const arrayList=players1.map((player)=><h2 key={player.id}>{player.id}---{player.name}---{player.country}---{player.runs}</h2>)
    const arrayList1=players1.map(player=> <Player player={player}/>);
    return (
        <div>
            <h1>ArrayList Demo</h1>
            <br/>
            {arrayList1}
        </div>
    )
}

export default ArrayDemo;