import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { catchError } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ShareData158563ProjectService {
  t:any;
  constructor(private http:HttpClient) {}

  getViewAllUsers(){
    return this.http.get("https://api.github.com/users");
  }

  getViewUserByName(userLoginName:any){
    return this.http.get(`https://api.github.com/users/${userLoginName}`);
  }

  
}
