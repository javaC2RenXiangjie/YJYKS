import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ExperimentRepotGatherComponent } from './experiment-repot-gather.component';

describe('ExperimentRepotGatherComponent', () => {
  let component: ExperimentRepotGatherComponent;
  let fixture: ComponentFixture<ExperimentRepotGatherComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ExperimentRepotGatherComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ExperimentRepotGatherComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
