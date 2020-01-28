import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';

import { AngularformComponent } from './angularform/angularform.component';

import { UserService } from './services/user.service';
import { RegisterComponent } from './user/register/register.component';
import { UsersComponent } from './user/users/users.component';
import { AppRoutingModule } from './app-routing.module';
import {HttpClientModule}from '@angular/common/http';

import { from } from 'rxjs';

@NgModule({
  declarations: [
    AppComponent,
    AngularformComponent,
    RegisterComponent,
    UsersComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
