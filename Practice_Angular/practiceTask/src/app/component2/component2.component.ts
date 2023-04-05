import { Component } from '@angular/core';
import { DataServiceService } from '../data-service.service';

@Component({
  selector: 'app-component2',
  templateUrl: './component2.component.html',
  styleUrls: ['./component2.component.css']
})
export class Component2Component {
  users:any;

  userId='';
  
  constructor(private us:DataServiceService){
  
  }
  
  onSubmit(){
  console.log(this.userId);
  
  this.us.getUsersById(this.userId).subscribe(data=>this.users=[data]);
  
  }
}
