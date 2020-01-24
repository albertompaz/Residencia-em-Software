import { Component, OnInit } from '@angular/core';
import { CursosService } from '../cursos/cursos.service';

@Component({
  selector: 'app-criar-curso',
  templateUrl: './criar-curso.component.html',
  styleUrls: ['./criar-curso.component.css'] ,
  providers: [CursosService]
})

export class CriarCursoComponent implements OnInit {

  cursos: string[] = [];

  /* injeção de dependencia de CursosService para pegar a informação de curso */
  constructor(private cursosService: CursosService) { }

  ngOnInit() {
      this.cursos = this.cursosService.getCursos();
  }

  onAddCurso(curso: string) {
    this.cursosService.addCurso(curso);

  }

}
