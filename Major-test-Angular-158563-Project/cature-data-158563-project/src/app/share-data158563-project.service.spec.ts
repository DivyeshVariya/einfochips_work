import { TestBed } from '@angular/core/testing';

import { ShareData158563ProjectService } from './share-data158563-project.service';

describe('ShareData158563ProjectService', () => {
  let service: ShareData158563ProjectService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ShareData158563ProjectService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
