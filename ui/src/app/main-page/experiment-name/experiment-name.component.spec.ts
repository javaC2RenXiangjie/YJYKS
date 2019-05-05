import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ExperimentNameComponent } from './experiment-name.component';

describe('ExperimentNameComponent', () => {
  let component: ExperimentNameComponent;
  let fixture: ComponentFixture<ExperimentNameComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ExperimentNameComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ExperimentNameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
