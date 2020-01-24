import { CursosService } from '../cursos/cursos.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-receber-curso-criado',
  templateUrl: './receber-curso-criado.component.html',
  styleUrls: ['./receber-curso-criado.component.css']
})
export class ReceberCursoCriadoComponent implements OnInit {

  curso: string;

  /* fazendo injeção de dependencias */
  constructor(private cursosService: CursosService) { }

  ngOnInit() {
    // recebendo a informação de evento emitido e subscrevendo
    this.cursosService.emitirCursoCriado.subscribe(
        cursoCriado => this.curso = cursoCriado
    );
  }

}
