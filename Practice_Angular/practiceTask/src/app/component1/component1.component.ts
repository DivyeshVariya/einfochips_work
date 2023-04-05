import { Component } from '@angular/core';
import { DataServiceService } from '../data-service.service';

@Component({
  selector: 'app-component1',
  templateUrl: './component1.component.html',
  styleUrls: ['./component1.component.css']
})
export class Component1Component {
  users:any;

  userId='';
  
  constructor(private us:DataServiceService){
  
  this.users=us.getusers().subscribe(data=>this.users=data);
  
  }
  
}
