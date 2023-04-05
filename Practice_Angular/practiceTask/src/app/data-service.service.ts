import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

  users:any;
  constructor(private http:HttpClient) {
  
  //this.users=http.get("http://localhost:8080/exttrainees").subscribe(data=>this.users=data);
  
  }
  
  getusers(){
  
  return this.http.get("https://jsonplaceholder.typicode.com/photos");
  
  }
  
  getUsersById(userId:any){
  
  return this.http.get(`https://jsonplaceholder.typicode.com/photos/${userId}`);
  }
}
