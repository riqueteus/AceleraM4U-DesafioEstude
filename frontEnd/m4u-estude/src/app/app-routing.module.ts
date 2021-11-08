import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AddressComponent } from './address/address.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { ManagementComponent } from './management/management.component';
import { StudentComponent } from './student/student.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
