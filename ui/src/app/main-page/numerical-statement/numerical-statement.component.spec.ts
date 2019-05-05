import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NumericalStatementComponent } from './numerical-statement.component';

describe('NumericalStatementComponent', () => {
  let component: NumericalStatementComponent;
  let fixture: ComponentFixture<NumericalStatementComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NumericalStatementComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NumericalStatementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
