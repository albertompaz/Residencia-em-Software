import { Injectable } from '@angular/core';

@Injectable()
export class CursosService {
    getCursos() {
        return ['Angular', 'Java', 'Phonegap'];
    }
}
