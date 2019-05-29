import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-chain-management',
  templateUrl: './chain-management.component.html',
  styleUrls: ['./chain-management.component.css']
})
export class ChainManagementComponent implements OnInit {

  mediaElement = document.getElementById('mediaElementID');

  closeVideo() {
    console.log('xxxxx');
  }
  constructor() { }

  ngOnInit() {
  }

}
