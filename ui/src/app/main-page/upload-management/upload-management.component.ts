import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {  FileUploader, FileSelectDirective } from 'ng2-file-upload/ng2-file-upload';

@Component({
  selector: 'app-upload-management',
  templateUrl: './upload-management.component.html',
  styleUrls: ['./upload-management.component.css']
})
export class UploadManagementComponent implements OnInit {

  UploadURL = 'api/users/imgPost';


// ng2-file-upload 方式上传文件。
  uploader: FileUploader = new FileUploader({ url: this.UploadURL, itemAlias: 'file' });

  file: File;

  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.uploader.onAfterAddingFile = (file) => { file.withCredentials = false; };
    this.uploader.onCompleteItem = (item: any, response: any, status: any, headers: any) => {
      alert(item);
    };
  }



// 普通方式上传。

  // imgFile: File;
  // formData: FormData = new FormData();
  // changeAfter(e) {
  //   console.log(this.imgFile);
  //   this.formData.append('imgFile', e.target.files[0], 'imgFile');
  // }


  // uploadFile() {
  //   console.log(this.formData.get('imgFile'));
  //   this.http.post(this.UploadURL, this.formData.get('imgFile'), {
  //     headers: {
  //       'Content-Type': 'multipart/form-data'
  //     }
  //   }).subscribe(res => console.log(res));
  // }
  // constructor(private http: HttpClient) {}
  // ngOnInit() {
  // }

}
