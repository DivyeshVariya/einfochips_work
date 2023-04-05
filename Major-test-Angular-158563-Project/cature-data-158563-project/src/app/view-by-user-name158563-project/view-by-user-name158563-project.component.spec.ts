import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewByUserName158563ProjectComponent } from './view-by-user-name158563-project.component';

describe('ViewByUserName158563ProjectComponent', () => {
  let component: ViewByUserName158563ProjectComponent;
  let fixture: ComponentFixture<ViewByUserName158563ProjectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewByUserName158563ProjectComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewByUserName158563ProjectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
