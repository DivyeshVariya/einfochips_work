function addPlayer(e)
{
    e.preventDefault();
    var pid=document.getElementById("playerid").value;
    var pname=document.getElementById("playername").value;
    var pruns=document.getElementById("playerruns").value;
    if(pid=="" || pname=="" || pruns=="")
    {
        alert("Please ! Enter vaild input....");
        return;
    }
    var tdata=document.getElementById("pdetail");

    const newtd1=document.createElement('td');
    newtd1.innerHTML=pid;

    const newtd2=document.createElement('td');
    newtd2.innerHTML=pname;

    const newtd3=document.createElement('td');
    newtd3.innerHTML=pruns;

    const newcheckbox=document.createElement('input');
    newcheckbox.type='checkbox';
    newcheckbox.id='checkboxid';
    newcheckbox.checked=false;

    const newtr=document.createElement('tr');
    newtr.id='playerdetails';
    newtr.appendChild(newtd1);
    newtr.appendChild(newtd2);
    newtr.appendChild(newtd3);
    newtr.appendChild(newcheckbox);

    tdata.appendChild(newtr);
    
}

function removePlayer(e)
{
    e.preventDefault();
    // var tdData=document.getElementById('playerdetails');
    // var checkbox=document.getElementsByClassName('checkboxid').value;
   
    var result = document.querySelectorAll("#checkboxid");
    var result1 = document.querySelectorAll("#pdetail");
    var result2 = document.querySelectorAll("#playerdetails");
    console.log(result);
    if(result.length==0)
    {
        alert("Sorry ! Empty list....");
        return;
    }
    for(let i=0;i<result.length;i++)
    {
        if(result[i].checked==true)
        {
            result2[i].parentElement.removeChild(result2[i]);
        }
    }
}