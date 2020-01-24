import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SettingsService {

  constructor() { }

  // função para setar o nosso local como pt-BR
  getLocale() {
    return 'pt-BR';
  }
}
