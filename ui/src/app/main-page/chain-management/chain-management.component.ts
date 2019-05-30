import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-chain-management',
  templateUrl: './chain-management.component.html',
  styleUrls: ['./chain-management.component.css']
})
export class ChainManagementComponent implements OnInit {
// 用户权限设置
  user: any = localStorage.getItem('user');
  userAuth: any;



  videoSrc: string;
  allFiles: any;
  changeVideoSrc(p) {
    this.videoSrc = '../../../assets/test_video/' + p;
    console.log(this.videoSrc);
  }
  closeVideo() {
  }
  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.userAuth = localStorage.getItem('userAuth');
    this.http.get('/api/files').subscribe(res => this.allFiles = res);
  }

}
