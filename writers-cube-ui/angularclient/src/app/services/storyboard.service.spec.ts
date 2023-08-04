import { TestBed } from '@angular/core/testing';

import { Storyboardservice} from './storyboard.service';

describe('StoryboardserviceService', () => {
  let service: Storyboardservice;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Storyboardservice);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
