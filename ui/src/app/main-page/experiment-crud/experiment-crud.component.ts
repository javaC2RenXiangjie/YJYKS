import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-experiment-crud',
  templateUrl: './experiment-crud.component.html',
  styleUrls: ['./experiment-crud.component.css']
})
export class ExperimentCrudComponent implements OnInit {

  userAuth = localStorage.getItem('userAuth');

  $: any;
  result: any;
  allSubs: any;
  newSub = {
    id: '',
    subject: '',
    addTime: '',
    owner: ''
  };
  updateSub = {
    id: '',
    subject: '',
    addTime: '',
    owner: ''
  };


  modify(sub) {
    $('#modify').modal('show');
    this.updateSub = sub;
  }

  update() {
    this.http.post('api/tsub/update', this.updateSub)
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

  deleteTsub(sub) {
    this.http.post('api/tsub/delete', sub)
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

  openAddSubModal() {
    $('#create').modal('show');
  }

  addSub() {
    this.http.post('api/tsub', this.newSub)
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
    this.http.get('/api/tsub').subscribe(res => {
      this.result = res;
      this.allSubs = this.result.ob;
    });
  }

}
