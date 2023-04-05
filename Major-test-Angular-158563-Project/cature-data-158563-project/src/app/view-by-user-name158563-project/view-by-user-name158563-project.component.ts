import { Component } from '@angular/core';
import { catchError, window } from 'rxjs';
import { ShareData158563ProjectService } from '../share-data158563-project.service';

@Component({
  selector: 'app-view-by-user-name158563-project',
  templateUrl: './view-by-user-name158563-project.component.html',
  styleUrls: ['./view-by-user-name158563-project.component.css']
})
export class ViewByUserName158563ProjectComponent {
users:any;
userLoginName='';
errorMsg="";
constructor(private shareData:ShareData158563ProjectService){

}

onSubmit(){
  this.shareData.getViewUserByName(this.userLoginName).subscribe({next:(data)=>{this.users=[data]},error:()=>{this.errorMsg="Error: User Not Found"; alert(this.errorMsg)}});
}
}
