import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-class-name',
  templateUrl: './class-name.component.html',
  styleUrls: ['./class-name.component.css']
})
export class ClassNameComponent implements OnInit {

  userAuth: any;
  result: any;
  allTrs: any;
  newTr = {
    id: '',
    addtime: '',
    status: '',
    subject_id: '',
    teacherid: '',
    num: ''
  };
  modifyedTr = {
    id: '',
    addtime: '',
    status: '',
    subject_id: '',
    teacherid: '',
    num: ''
  };
  modify(tr) {
    $('#modify').modal('show');
    this.modifyedTr = tr;
  }

  update() {
    this.http.post('api/trinfo/update', this.modifyedTr)
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
  openAddTrModal() {
    $('#create').modal('show');
  }
  addTr() {
    this.http.post('api/trinfo', this.newTr)
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

  deleteTr(tr) {
    this.http.post('api/trinfo/delete/', tr)
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
  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.userAuth = localStorage.getItem('userAuth');
    this.http.get('api/trinfo')
    .subscribe(res => {
      this.result = res;
      this.allTrs = this.result.ob;
      console.log(this.allTrs);
    });
  }

}
