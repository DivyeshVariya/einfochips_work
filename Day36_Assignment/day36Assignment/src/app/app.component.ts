import { Component } from '@angular/core';
import { FormControl } from '@angular/forms';
import { FormGroup } from '@angular/forms';
import { Validators } from '@angular/forms';




@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'day36Assignment';
  name1:string|any='';
  email:string|any='';
  password:string|any='';
  isClicked:boolean|any=false;
  name=new FormControl('',Validators.required);
  registerfrm=new FormGroup({name1: new FormControl('',[Validators.maxLength(10),Validators.required]),email: new FormControl('',[Validators.email,Validators.required]),password: new FormControl('',[Validators.maxLength(8),Validators.required])});
  clearName() {
    console.log(this.name.value);
  }
  clearName1() {
    this.isClicked=true;
    if(this.registerfrm.status==='VALID'&&this.isClicked===true)
    {
    console.log(this.registerfrm.value);
    this.name1=this.registerfrm.get('name1')?.value;
    this.email=this.registerfrm.get('email')?.value;
    this.password=this.registerfrm.get('password')?.value;
    }
    
  }
}
