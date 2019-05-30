import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-user-management',
  templateUrl: './user-management.component.html',
  styleUrls: ['./user-management.component.css']
})
export class UserManagementComponent implements OnInit {

  subButShow: any = true;
  detail: any = true;
  addUserDis: any = true;
  $: any;
  userAuth: any;
  modalUser = {
    id: '',
    name: '',
    gender: '',
    email: '',
    phone: '',
    area: '',
    idStatus: '',
    addTime: '',
    authority: ''
  };
  newUser = {
    name: '',
    gender: '',
    email: '',
    phone: '',
    area: '',
    idStatus: '',
    addTime: '',
    authority: ''
  };
  result: any;
  users: any = [];
  delUser(email) {
    this.http.post('api/users/delete/' + email, null)
    .subscribe(res => {
      this.result = res;
      if ( this.result.code === 2) {
        alert(this.result.msgContent);
        location.reload();
      } else {
        alert(this.result.msgContent);
      }
    });
  }

  reset() {
    this.newUser.name = '';
    this.newUser.gender = '';
    this.newUser.email = '';
    this.newUser.phone = '';
    this.newUser.area = '';
    this.newUser.idStatus = '';
    this.newUser.addTime = '';
    this.newUser.authority = '';
  }

  openModal() {
    $('#myModal').modal('show');
  }
  modify(user) {
    this.subButShow = true;
    this.modalUser = user;
    this.addUserDis = true;
    this.detail = false;
    this.openModal();
  }
  showUserDetail(user) {
    this.subButShow = false;
    this.modalUser = user;
    this.addUserDis = true;
    this.detail = true;
    this.openModal();
  }

  // 提交修改
  update() {
    this.http.post('api/users/update', this.modalUser)
    .subscribe(res => {
      this.result = res;
      if (this.result.code === 2) {
        alert(this.result.msgContent);
        location.reload();
      } else {
        alert(this.result.msgContent);
      }
    });
  }

  openAddUserModal() {
    $('#addUserModal').modal('show');
  }
  // 添加用户
  submit() {
    this.http.post('api/register', this.newUser)
    .subscribe(res => {
      this.result = res;
      if ( this.result.code === 2) {
        alert(this.result.msgContent);
        location.reload();
      } else {
        alert(this.result.msgContent);
      }
    });
  }


  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.userAuth = localStorage.getItem('userAuth');
    this.http.get('api/users').subscribe(res => {
         this.users = res;
        });
  }

}
