import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-parent-data',
  templateUrl: './parent-data.component.html',
  styleUrls: ['./parent-data.component.css']
})
export class ParentDataComponent implements OnInit {
  @Input() name: string ="";
  /*Exclamação serve para já deixar inicializado as informações, assim como a situação acima!*/
  @Input() userData!: {email: string, role: string};

  constructor() { }

  ngOnInit(): void {
  }

}
