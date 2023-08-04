import { TestBed } from '@angular/core/testing';

import { PlotpointService } from './plotpoint.service';

describe('PlotpointService', () => {
  let service: PlotpointService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PlotpointService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
