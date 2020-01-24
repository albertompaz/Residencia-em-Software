/* importando o angular core, que é um baixo nivel de serviço e utilidades. É ele que define a estrutura 
dos componentes, hirarquia, detecta mudanças, renderiza, etc */

import { Component, OnInit } from '@angular/core';

@Component({
  /* definindo: 
  selector: que é o componente
  templateUrl: template que ele se conectara
  styleUrls: css's a serem usados */
  selector: 'app-meu-primeiro2',
  templateUrl: './meu-primeiro2.component.html',
  styleUrls: ['./meu-primeiro2.component.css']
})
// criando uma classe e exportando ela pra ser chamanda pelo template
export class MeuPrimeiro2Component {

}
