import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Hero } from '../hero';
import { HEROES } from '../mockheroes';

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})

export class HeroesComponent implements OnInit {

  heroes = HEROES;
  selectedHero: Hero;

  constructor() { }
  message="hello from child";
  @Output() HeroMessage=new EventEmitter<string>();

send(n:string)

{
this.HeroMessage.emit(this.message);
}
  ngOnInit() {
  //this.HeroMessage.emit(this.message);
  }
  
}
