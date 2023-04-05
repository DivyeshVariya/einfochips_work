import { Component } from '@angular/core';

@Component({
  selector: 'app-csk-players',
  templateUrl: './csk-players.component.html',
  styleUrls: ['./csk-players.component.css']
})
export class CskPlayersComponent {
  playerData=[
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
  ]
}
