function Fun1(e){
    e.preventDefault();
    var team1_name = document.getElementById("team1_name").value;
    var team1_score = document.getElementById("team1_score").value;
    var team2_name = document.getElementById("team2_name").value;
    var team2_score = document.getElementById("team2_score").value;

    if(team1_name=="" || team1_score=="" || team2_name=="" || team2_score=="")
    {
        alert("Please ! Enter the value in input field. Right now it is empty...")
        console.log("1")
    }    
    else if(team1_name === team2_name)
    {
        alert("Team name must different...")
        console.log("2")
    }
    else if(team1_score[2]!="/" && team1_score.length===4 || team2_score[2]!="/" && team2_score.length===4)
    {
        alert("Please ! Enter the score in vaild format...1")
        console.log("3")
    }
    else if(team1_score[3]!="/" && team1_score.length>=5 || team2_score[3]!="/" && team1_score.length>=5)
    {
        alert("Please ! Enter the score in vaild format...2")
        console.log("4")
    }
    else
    {
        var sp1=team1_score.split("/");
        var sp2=team2_score.split("/");
        if(sp1[1]>10 || sp2[1]>10)
        {
            alert("Invaild Vcat...")
        }
        max_score=Math.max(sp1[0],sp2[0])
        if(sp1[0]===sp2[0])
        {
            max_vcat=Math.max(sp1[1],sp2[1])
            if(max_vcat==sp1[1])
            {
                alert("Team 2 won the match...")
                document.getElementById("result").innerHTML =  `Team 2 - ${team2_name} won the match by ${sp1[1]-sp2[1]} vcats...`
            }
            else if(max_vcat==sp2[1])
            {
                alert("Team 1 won the match...")
                document.getElementById("result").innerHTML = `Team 1 - ${team1_name} won the match by ${sp2[1]-sp1[1]} vcats...`
            }
            else
            {
                alert("Match is tie...")
                document.getElementById("result").innerHTML = " Match is tie..."
            }
        }
        else if(max_score===sp1[0])
        {
            alert("Team 1 won the match...")
            console.log("6")
            document.getElementById("result").innerHTML =  `Team 1 - ${team1_name}won the match by ${sp1[0]-sp2[0]} runs...`
        }
        else if(max_score===sp2[0]){
            alert("Team 2 won the match...")
            document.getElementById("result").innerHTML = `Team 2 - ${team2_name} won the match by ${sp2[0]-sp1[0]} runs...`
        }
        else
        {
            alert("Something want to wrong...")
        }
        
    }
}