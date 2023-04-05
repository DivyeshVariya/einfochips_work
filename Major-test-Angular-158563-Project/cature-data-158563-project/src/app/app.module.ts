import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { ViewByUserName158563ProjectComponent } from './view-by-user-name158563-project/view-by-user-name158563-project.component';
import { ViewAllUsers158563ProjectComponent } from './view-all-users158563-project/view-all-users158563-project.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ViewByUserName158563ProjectComponent,
    ViewAllUsers158563ProjectComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
