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
import { UpdateUserComponent } from './user/update-user/update-user.component';
import { PipeComponent } from './pipes/pipe/pipe.component';
import { CustompipePipe } from './custompipe.pipe';

@NgModule({
  declarations: [
    AppComponent,
    AngularformComponent,
    RegisterComponent,
    UsersComponent,
    UpdateUserComponent,
    PipeComponent,
    CustompipePipe
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
