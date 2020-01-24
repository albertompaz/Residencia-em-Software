import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GradeDeHorariosComponent } from './grade-de-horarios.component';

describe('GradeDeHorariosComponent', () => {
  let component: GradeDeHorariosComponent;
  let fixture: ComponentFixture<GradeDeHorariosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GradeDeHorariosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GradeDeHorariosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
