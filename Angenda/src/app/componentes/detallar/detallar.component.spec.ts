import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DetallarComponent } from './detallar.component';

describe('DetallarComponent', () => {
  let component: DetallarComponent;
  let fixture: ComponentFixture<DetallarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DetallarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DetallarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
