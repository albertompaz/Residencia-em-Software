import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-diretiva-ngif',
  templateUrl: './diretiva-ngif.component.html',
  styleUrls: ['./diretiva-ngif.component.css']
})
export class DiretivaNgifComponent implements OnInit {

  /* Criando a variavel que é um vetor que sera utilizada no template */
  //cursos: string[] = [];
  cursos: string[] = ["Angular", "Java", "React"];

  /* Criando a variavel booleana que sera utilizada no template */
  mostrarCursos: boolean = false;

  constructor() { }

  ngOnInit() {
  }

  // Méto que simplesmente altera o valor da variavel booleana
  onMostrarCursos(){
    this.mostrarCursos = !this.mostrarCursos;
  }

}
 