import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CursosService {

  /* método para pegar os cursos, aonde puxara o id e o nome dos cursos
  poderiamos pegar de um servidor, mas nesse caso estamos retornando estaticamente */
  getCursos() {
    return [
      {id: 1, nome: 'Angular'},
      {id: 2, nome: 'Java'}
    ];
  }

  getCurso(id: number){
    /* iterando a lista de cursos */
    let cursos = this.getCursos();
    /* for para percorrer o vetor de cursos e verificar se o id bate */
    for (let i=0; i<cursos.length; i++) {
      let curso = cursos[i];
      if (curso.id == id) {
        /* retornando o curso achado */
        return curso;
      }
    }
    /* se não achar retorna vazio */
    return null;
  }

  constructor() { }
}
