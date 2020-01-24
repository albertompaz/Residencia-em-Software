import { Component, OnInit } from '@angular/core';
import { Pessoa } from 'src/modulos/pessoa';

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent implements OnInit {

  usuarioLogado: Pessoa[];

  constructor() { }

  ngOnInit() {
    if (localStorage.getItem("usuarioLogado") !== null) { // verificando se o local storage ta vazio ou não
      this.usuarioLogado = JSON.parse(localStorage.getItem("usuarioLogado"));
    }
    console.log(this.usuarioLogado);
  }

}
