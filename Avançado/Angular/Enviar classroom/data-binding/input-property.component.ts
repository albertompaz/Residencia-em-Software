/* necessario realizar a importação do Input */

import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-curso',
  templateUrl: './input-property.component.html',
  styleUrls: ['./input-property.component.css']
})
export class InputPropertyComponent implements OnInit {


  /* o decorator @Input ta significando a importação do componente pai que é o data-binding, 
  criando uma associação externa */
  /* esse 'nome' é um nome interno, ele sera usado pelo componente */ 
  /* todo mundo que for usar o nomeCurso externamente usará o 'nome', e internamente nomeCurso  */
  /* Declarando o nomeCurso como vazio, pois posteriormente ele recebera o valor da variavel do Pai */
  @Input('nome') nomeCurso = '';

  constructor() { }

  ngOnInit() {
  }

}
