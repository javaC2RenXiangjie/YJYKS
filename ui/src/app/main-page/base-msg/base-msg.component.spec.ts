import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BaseMsgComponent } from './base-msg.component';

describe('BaseMsgComponent', () => {
  let component: BaseMsgComponent;
  let fixture: ComponentFixture<BaseMsgComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BaseMsgComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BaseMsgComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
