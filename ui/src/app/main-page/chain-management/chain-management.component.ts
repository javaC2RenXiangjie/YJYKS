import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-chain-management',
  templateUrl: './chain-management.component.html',
  styleUrls: ['./chain-management.component.css']
})
export class ChainManagementComponent implements OnInit {

  user: any = localStorage.getItem('user');
  userAuth: any = this.user.authority;
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
    this.http.get('/api/files').subscribe(res => this.allFiles = res);
  }

}
