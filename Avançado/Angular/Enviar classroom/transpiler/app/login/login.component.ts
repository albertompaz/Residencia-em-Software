
import { Component, OnInit } from '@angular/core';

import { AuthService } from './auth.service';
import { Usuario } from './usuario';
import { ChamadasService } from '../chamadas.service';
import { Pessoa } from 'src/modulos/pessoa';
import { Endereco } from 'src/modulos/endereco';
import { Disciplina } from 'src/modulos/disciplina';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  pessoas: Pessoa[];
  enderecos: Endereco[];
  disciplinas: Disciplina[];

  private usuario: Usuario = new Usuario();

  constructor(private authService: AuthService, private chamadas: ChamadasService) { }

  ngOnInit() {
    localStorage.clear();
    this.chamadas.list().subscribe(dados => this.pessoas = dados);
    this.chamadas.listEndereco().subscribe(dados => this.enderecos = dados)
    this.chamadas.listarDisciplnas().subscribe(dados => this.disciplinas = dados );
  }

  fazerLogin() {
    this.authService.fazerLogin(this.usuario, this.pessoas)
    console.log(this.pessoas);
    console.log(this.enderecos);
    console.log(this.disciplinas);
    localStorage.setItem('enderecos', JSON.stringify(this.enderecos))
    localStorage.setItem('disciplinas', JSON.stringify(this.disciplinas))
    localStorage.setItem('pessoas', JSON.stringify(this.pessoas))
    

  }
  
}
