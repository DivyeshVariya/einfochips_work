import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactusComponent } from './contactus/contactus.component';
import { CskPlayersComponent } from './csk-players/csk-players.component';
import { HomeComponent } from './home/home.component';
import { PlayersComponent } from './players/players.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  {path:"home",component:HomeComponent},
  {
    path:"contactus",component:ContactusComponent
  },
  {path:"players",component:PlayersComponent},
  {path:"csk-players",component:CskPlayersComponent},
  {path:"user",component:UserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
