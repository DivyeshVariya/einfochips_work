import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CskPlayersComponent } from './csk-players.component';

describe('CskPlayersComponent', () => {
  let component: CskPlayersComponent;
  let fixture: ComponentFixture<CskPlayersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CskPlayersComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CskPlayersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
