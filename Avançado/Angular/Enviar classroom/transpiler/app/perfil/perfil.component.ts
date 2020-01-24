import { Component, OnInit } from '@angular/core';
import { Pessoa } from 'src/modulos/pessoa';
import { Endereco } from 'src/modulos/endereco';
import { ChamadasService } from '../chamadas.service';
//import { EnderecosService } from './enderecos.service';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: ['./perfil.component.css']
})
export class PerfilComponent implements OnInit {

  usuarioLogado: Pessoa[];

  pessoa: Pessoa[];

  enderecos: Endereco[];

  enderecos2: any//Endereco[];

  enderecoLogado: Endereco[];

  constructor(private chamadas: ChamadasService){}//, private chamarEndereco: EnderecosService) { }

  ngOnInit() {
    if (localStorage.getItem("usuarioLogado") !== null) { // verificando se o local storage ta vazio ou não
      this.usuarioLogado = JSON.parse(localStorage.getItem("usuarioLogado"));
    }

    if (localStorage.getItem("enderecos") !== null) { // verificando se o local storage ta vazio ou não
      this.enderecos = JSON.parse(localStorage.getItem("enderecos"));
    }
    //console.log(this.enderecos);

    this.chamadas.listEndereco().subscribe(dados => this.enderecos2 = dados)
    console.log("Vai dar erro")
    console.log(this.enderecos2)

    
    
    this.enderecoAUsar(this.enderecos, this.usuarioLogado)
  }

  enderecoAUsar(e, u) {
    e.forEach(element => {
      if (element.id == u.id){
        this.enderecoLogado = element;
      }
      
    });
  }

}
