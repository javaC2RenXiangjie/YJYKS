import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChainManagementComponent } from './chain-management.component';

describe('ChainManagementComponent', () => {
  let component: ChainManagementComponent;
  let fixture: ComponentFixture<ChainManagementComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChainManagementComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChainManagementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
