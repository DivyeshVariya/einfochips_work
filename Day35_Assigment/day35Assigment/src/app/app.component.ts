import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'day35Assigment';
  value1="";
  re_value="";
  receivedata(value:string)
  {
    console.log(value);
    this.re_value=value;
  }

}
