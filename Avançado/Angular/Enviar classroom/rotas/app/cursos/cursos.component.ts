import { Component, OnInit } from '@angular/core';
import { CursosService } from './cursos.service';

@Component({
  selector: 'app-cursos',
  templateUrl: './cursos.component.html',
  styleUrls: ['./cursos.component.css']
})
export class CursosComponent implements OnInit {

  /* variavel para receber os cursos */
  cursos: any[];

  /* precisamos fazer a injeçao de dependencia pois estamos utilizando um serviço */
  constructor(private cursosService: CursosService) { }

  ngOnInit() {
    /* usando nossa variavel cursos pra receber os cursos que esta vindo de cursos service */
    this.cursos = this.cursosService.getCursos();
  }

}
