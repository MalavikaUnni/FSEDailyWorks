import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from 'src/app/service/user.service';
import { User } from 'src/app/models/user';

@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.css']
})
export class UserProfileComponent implements OnInit {
  user:User;
  userProfile: FormGroup;
  constructor(private router: Router, private userservice:UserService) { }

  ngOnInit() {
    const c = localStorage.getItem('userId');
    this.userservice.getUserById(+c).subscribe(data =>{
      this.user=data;
    })
  }

}
