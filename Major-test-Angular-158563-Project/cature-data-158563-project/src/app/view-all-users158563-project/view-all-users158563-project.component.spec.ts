import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewAllUsers158563ProjectComponent } from './view-all-users158563-project.component';

describe('ViewAllUsers158563ProjectComponent', () => {
  let component: ViewAllUsers158563ProjectComponent;
  let fixture: ComponentFixture<ViewAllUsers158563ProjectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewAllUsers158563ProjectComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewAllUsers158563ProjectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
