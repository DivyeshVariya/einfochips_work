import { Component, Input,Output,EventEmitter} from '@angular/core';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-demo',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.css']
})
export class DemoComponent {
@Input() value123="";
@Output() newevent=new EventEmitter<any>();

sendMsg(value: string){
  this.newevent.emit("hello bro....");
}
uname=""
saveData(myfrm: NgForm)
{
  console.log(myfrm.value["uname"]);
}
}
