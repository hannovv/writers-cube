import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewstoryboardsComponent } from './viewstoryboards.component';

describe('ViewstoryboardsComponent', () => {
  let component: ViewstoryboardsComponent;
  let fixture: ComponentFixture<ViewstoryboardsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ViewstoryboardsComponent]
    });
    fixture = TestBed.createComponent(ViewstoryboardsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
