import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Component0Component } from './component0/component0.component';
import { Component1Component } from './component1/component1.component';
import { Component2Component } from './component2/component2.component';

const routes: Routes = [
{path:"component0",component:Component0Component},
{path:"component1",component:Component1Component},
{path:"component2",component:Component2Component}
]
;

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 

}
