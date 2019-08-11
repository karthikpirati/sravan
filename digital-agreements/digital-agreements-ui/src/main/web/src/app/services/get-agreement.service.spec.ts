import { TestBed } from '@angular/core/testing';

import { GetAgreementService } from './get-agreement.service';

describe('GetAgreementService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: GetAgreementService = TestBed.get(GetAgreementService);
    expect(service).toBeTruthy();
  });
});
