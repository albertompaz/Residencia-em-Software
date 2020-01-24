import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-operador-elvis', 
  templateUrl: './operador-elvis.component.html',
  styleUrls: ['./operador-elvis.component.css']
})
export class OperadorElvisComponent implements OnInit {

  // o any faz o objeto poder receber informação de qualquer tipo
  tarefa: any = {
    desc: 'Descrição da tarefa',
    /* responsavel: {
      usuario: null
    } */
    responsavel: {
      usuario: {
        nome : 'Marlan'
      }
    }
  };

  constructor() { }

  ngOnInit() {
  }

}
