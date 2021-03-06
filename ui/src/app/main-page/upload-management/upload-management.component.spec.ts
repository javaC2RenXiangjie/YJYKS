import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UploadManagementComponent } from './upload-management.component';

describe('UploadManagementComponent', () => {
  let component: UploadManagementComponent;
  let fixture: ComponentFixture<UploadManagementComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UploadManagementComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UploadManagementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
