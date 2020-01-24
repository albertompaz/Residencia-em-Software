import { TestBed } from '@angular/core/testing';

import { ChamadasService } from './chamadas.service';

describe('ChamadasService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ChamadasService = TestBed.get(ChamadasService);
    expect(service).toBeTruthy();
  });
});
