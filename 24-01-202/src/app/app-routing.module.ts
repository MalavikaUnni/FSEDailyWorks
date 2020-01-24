import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AngularformComponent } from './angularform/angularform.component';


const routes: Routes = [
  {path:'angular',component:AngularformComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
