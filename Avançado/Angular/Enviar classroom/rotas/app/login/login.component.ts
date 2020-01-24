import { Component, OnInit } from '@angular/core';
import { AuthService } from './auth.service';

import { Usuario } from './usuario';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  /* criando um objeto usuario */ 
  usuario: Usuario = new Usuario();

  // fazendo a injeção de dependencia no construtor
  constructor(private authService: AuthService) { }

  ngOnInit() {
  }

  fazerLogin(){
    // chamando o serviço passando o usuario
      this.authService.fazerLogin(this.usuario);
  }

}
