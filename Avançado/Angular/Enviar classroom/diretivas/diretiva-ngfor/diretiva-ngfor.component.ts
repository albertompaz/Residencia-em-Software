import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-diretiva-ngfor',
  templateUrl: './diretiva-ngfor.component.html',
  styleUrls: ['./diretiva-ngfor.component.css']
})
export class DiretivaNgforComponent implements OnInit {

  // Criando a variavel que será um vetor pra ser usado no template
  cursos: string[] = ['Angular', 'Java', 'Phonegap'];

  constructor() { }

  // Método para se contabilizar o index que será usado no tamplate
  ngOnInit() {
    for (let i = 0; i < this.cursos.length; i++) {
      const curso = this.cursos[i];
    }
  }
 
}
