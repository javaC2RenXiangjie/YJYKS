import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  inputEmail: any;
  inputPassword: any;
  result: any = {};
  user: any;
  login() {
    this.http.post('api/login/' + this.inputEmail + '&' + this.inputPassword, null)
    .subscribe(res => {
      this.result = res;
      this.user = this.result.ob;
      if (this.result.code === 2) {
        this.user = this.result.ob;
        localStorage.setItem('user', this.user);
        localStorage.setItem('userAuth', this.user.authority);
        localStorage.setItem('userName', this.user.name);

        alert(this.result.msgContent);
        location.href = 'http://localhost:9000/main';
      } else {
        alert(this.result.msgContent);
        this.inputEmail = '';
        this.inputPassword = '';
      }
    });

  }
  constructor(private http: HttpClient) { }

  ngOnInit() {
    $('#myModal').show();
  }

}
