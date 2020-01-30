import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipe',
  templateUrl: './pipe.component.html',
  styleUrls: ['./pipe.component.css']
})
export class PipeComponent implements OnInit {
message :string;
price:number;
salary:number;
dob:Date;
user={
  id2:1001,
  name:'CTS'
}
  constructor() { }

  ngOnInit() {
    this.message='Today is 30th Jan 2020';
    this.price=20000;
    this.salary=1000.899;
    this.dob=new Date(1997,8,30);

  }

}
