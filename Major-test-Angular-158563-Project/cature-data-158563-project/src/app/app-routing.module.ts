import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ViewAllUsers158563ProjectComponent } from './view-all-users158563-project/view-all-users158563-project.component';
import { ViewByUserName158563ProjectComponent } from './view-by-user-name158563-project/view-by-user-name158563-project.component';

const routes: Routes = [
  {path:"viewallusers",component:ViewAllUsers158563ProjectComponent},
  {path:"viewuserbylogin",component:ViewByUserName158563ProjectComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
