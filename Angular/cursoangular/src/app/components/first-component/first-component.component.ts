import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first-component',
  templateUrl: './first-component.component.html',
  styleUrls: ['./first-component.component.css']
})
export class FirstComponentComponent implements OnInit {

  name: String = 'Fabio';
  age = 33;
  job = 'Programmer';
  hobbies = ['Correr','Jogar', 'Estudar'];
  car = {
    name: 'Fusca',
    year: 1970,
  };

  constructor() { }

  ngOnInit(): void {
  }

}
