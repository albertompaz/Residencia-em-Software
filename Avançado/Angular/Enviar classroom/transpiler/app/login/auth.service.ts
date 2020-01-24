import { Usuario } from './usuario';
import { Injectable, EventEmitter } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http'
import { ChamadasService } from '../chamadas.service';
import { Pessoa } from 'src/modulos/pessoa';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private usuarioAutenticado: boolean = false;

  pessoas: Pessoa[];

  mostrarMenuEmitter = new EventEmitter<boolean>();

  constructor(private router: Router, private http: HttpClient, private chamadas: ChamadasService) { }

  fazerLogin(usuario: Usuario, pessoa: Pessoa[]) {

    for (let i=0; i<pessoa.length; i++){

      if (usuario.cpf == pessoa[i].cpf && usuario.senha == pessoa[i].senha) {

        this.usuarioAutenticado = true;
  
        this.mostrarMenuEmitter.emit(true)

        // jogando o usuario logado pro local storage
        localStorage.setItem('usuarioLogado', JSON.stringify(pessoa[i]))
  
        this.router.navigate(['/index']);

        break;

      } else {
        this.usuarioAutenticado = false;
  
        this.mostrarMenuEmitter.emit(false)
        
      }

      
    }
  }

}
