import { TestBed } from '@angular/core/testing';

import { ReportingService } from './reporting.service';

describe('DashboardService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ReportingService = TestBed.get(ReportingService);
    expect(service).toBeTruthy();
  });
});
