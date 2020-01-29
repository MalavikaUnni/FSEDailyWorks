import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AngularformComponent } from './angularform/angularform.component';
import { UsersComponent } from './user/users/users.component';
import { RegisterComponent } from './user/register/register.component';
import { UpdateUserComponent } from './user/update-user/update-user.component';


const routes: Routes = [
  //{path:'angular',component:AngularformComponent},
  //{path :'serviceDemo',component:HomeComponent},
  {path:'users' ,component:UsersComponent},
  //{path :'user' , component:UserComponent}
  {path :"register",component:RegisterComponent},
  {path:'update-user',component:UpdateUserComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
