import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatestoryboardComponent } from './createstoryboard.component';

describe('CreatestoryboardComponent', () => {
  let component: CreatestoryboardComponent;
  let fixture: ComponentFixture<CreatestoryboardComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CreatestoryboardComponent]
    });
    fixture = TestBed.createComponent(CreatestoryboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
