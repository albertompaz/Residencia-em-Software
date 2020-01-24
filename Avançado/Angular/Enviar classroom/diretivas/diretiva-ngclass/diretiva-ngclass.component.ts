import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-diretiva-ngclass', 
  templateUrl: './diretiva-ngclass.component.html',
  styleUrls: ['./diretiva-ngclass.component.css']
})
export class DiretivaNgclassComponent implements OnInit {

  /* criando variavel booleana */
  meuFavorito: boolean = false;

  constructor() { }

  ngOnInit() {
  }

  /* função para trocar o valor da variavel booleana */
  onClick(){
    this.meuFavorito = !this.meuFavorito;
  }

}
