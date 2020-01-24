import { Injectable , EventEmitter} from '@angular/core';

import { Router } from '@angular/router';

import { Usuario } from './usuario';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  /* deixando a autentificação padrao como falso */
  usuarioAutenticado = false;

  /* um evento pra mostrar se o nosso menu será visivel ou não */
  mostrarMenuEmitter = new EventEmitter<boolean>();

  /* injeção de dependencia do roteamento */
  constructor( private router: Router) { }
  
  fazerLogin(usuario: Usuario) {
    /* if para verificar se está batendo as informações */
    if (usuario.nome === 'usuario@email.com' && usuario.senha === '123456') {
      this.usuarioAutenticado = true;
      /* emitindo o evento que o menu sera emitido para true */
      this.mostrarMenuEmitter.emit(true);
      /* se logou sera mudado a rota */
      this.router.navigate(['/home']);
      /* se não foi logado as informações booleanas serão falsas */
    } else {
      this.usuarioAutenticado = false;
      this.mostrarMenuEmitter.emit(false);

    }
  }
 
}
