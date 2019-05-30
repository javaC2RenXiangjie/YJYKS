import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-base-msg',
  templateUrl: './base-msg.component.html',
  styleUrls: ['./base-msg.component.css']
})
export class BaseMsgComponent implements OnInit {

  updis = true;
  userAuth: any;
  $: any;
  result: any;
  allEquips: any;
  newEquip = {
    id: '',
    store: '',
    addtime: '',
    status: '',
    instruction: ''
  };
  equitpModify = {
    id: '',
    store: '',
    addtime: '',
    status: '',
    instruction: ''
  };


  openEquipModify(eq) {
    this.equitpModify = eq;
    this.updis = true;
    $('#equipModifyUpdate').modal('show');
  }

  submitUpdate() {
    this.http.post('api/equip/update', this.equitpModify)
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


  delSub(sub) {
    this.http.post('api/equip/delete', sub)
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

  update() {
    this.http.post('api/equip/update', this.equitpModify)
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
  openAddEquipModal() {
    $('#create').modal('show');
  }
  addEquiip() {
    this.http.post('api/equip', this.newEquip)
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
  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.userAuth = localStorage.getItem('userAuth');
    this.http.get('api/equip')
    .subscribe(res => {
      this.result = res;
      this.allEquips = this.result.ob;
    });
  }



}
