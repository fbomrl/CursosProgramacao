import { Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  userName = 'Joaquim';

  userData = {
    email: 'joaquims@mail.com',
    role: 'Admin',
  }; 

  title = 'cursoangular';
}
