import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ExperimentCrudComponent } from './experiment-crud.component';

describe('ExperimentCrudComponent', () => {
  let component: ExperimentCrudComponent;
  let fixture: ComponentFixture<ExperimentCrudComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ExperimentCrudComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ExperimentCrudComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
