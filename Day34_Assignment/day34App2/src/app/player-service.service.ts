import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PlayerServiceService {

  constructor() { }
  getPlayers(){
    return [
      {
        "name":"virat","skill":"batman","team":"rcb"
      },
      {
        "name":"virat1","skill":"batman","team":"csk"
      },
      {
        "name":"virat2","skill":"batman","team":"rcb"
      },
      {
        "name":"virat3","skill":"batman","team":"csk"
      }
    ];
  }
}
