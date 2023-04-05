import { Component } from '@angular/core';
import { PlayerServiceService } from '../player-service.service';

@Component({
  selector: 'app-players',
  templateUrl: './players.component.html',
  styleUrls: ['./players.component.css']
})
export class PlayersComponent {

  players:any;
  constructor(private ps:PlayerServiceService)
  {
    this.players=ps.getPlayers();
  }
}
