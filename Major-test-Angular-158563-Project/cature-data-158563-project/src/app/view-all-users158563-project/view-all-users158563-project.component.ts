import { Component } from '@angular/core';
import { ShareData158563ProjectService } from '../share-data158563-project.service';

@Component({
  selector: 'app-view-all-users158563-project',
  templateUrl: './view-all-users158563-project.component.html',
  styleUrls: ['./view-all-users158563-project.component.css']
})
export class ViewAllUsers158563ProjectComponent {

  users:any;
  constructor(private shareData:ShareData158563ProjectService){
  this.users=shareData.getViewAllUsers().subscribe(data=>this.users=data);
  }
}
