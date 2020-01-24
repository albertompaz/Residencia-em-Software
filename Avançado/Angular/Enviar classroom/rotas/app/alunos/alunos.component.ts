import { Component, OnInit } from '@angular/core';
import { AlunosService } from './alunos.service';

@Component({
  selector: 'app-alunos',
  templateUrl: './alunos.component.html',
  styleUrls: ['./alunos.component.css']
})
export class AlunosComponent implements OnInit {

  /* variavel para receber os alunos */
  alunos: any[];

  /* precisamos fazer a injeçao de dependencia pois estamos utilizando um serviço */
  constructor(private alunosService: AlunosService) { }

  ngOnInit() {
    /* usando nossa variavel alunos pra receber os alunos que esta vindo de alunos service */
    this.alunos = this.alunosService.getAlunos();
  }

}
