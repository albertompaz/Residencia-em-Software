import { Injectable } from '@angular/core';

@Injectable()

export class AuthService {
    isAuthenticated() {
        // pega o token cadastro no local storage
        const token = localStorage.getItem('cadastro');
        // checa se existe token
        if (token) {
            return true;
        }
            return false;
        }
}