import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  user:any;
  constructor(private http:HttpClient)
  {
    // this.user=http.get("http://localhost:8080/fatch").subscribe(data=>this.user=data);
  }

  getUsers(){
    return this.http.get("http://localhost:8080/fatch");

  }
}
