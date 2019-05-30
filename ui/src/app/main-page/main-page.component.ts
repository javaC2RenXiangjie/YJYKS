import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css']
})
export class MainPageComponent implements OnInit {

  user: any = localStorage.getItem('user');
  userAuth: any = this.user.authority;
  userName: any = this.user.name;

  logOut() {
    localStorage.clear();
    location.href = 'http://localhost:9000/login';
  }

  constructor() { }

  ngOnInit() {
    if (!localStorage.getItem('user')) {
      localStorage.clear();
      location.href = 'http://localhost:9000/login';
    } else {
      this.user = localStorage.getItem('user');
      this.userAuth = localStorage.getItem('userAuth');
      this.userName = localStorage.getItem('userName');
    }
  }

}
