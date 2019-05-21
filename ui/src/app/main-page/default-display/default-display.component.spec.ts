import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DefaultDisplayComponent } from './default-display.component';

describe('DefaultDisplayComponent', () => {
  let component: DefaultDisplayComponent;
  let fixture: ComponentFixture<DefaultDisplayComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DefaultDisplayComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DefaultDisplayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
