import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {

  title="ram";
  users:any;
  constructor(private us:UserServiceService){
    this.users=us.getUsers().subscribe(data=>this.users=data);
  }
  
  
}
