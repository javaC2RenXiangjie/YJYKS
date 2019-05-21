import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-user-management',
  templateUrl: './user-management.component.html',
  styleUrls: ['./user-management.component.css']
})
export class UserManagementComponent implements OnInit {

  public users: any = [];
  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.http.get('api/users').subscribe(res => {
         this.users = res;
        });
  }

}
