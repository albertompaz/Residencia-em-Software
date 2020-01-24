import { Component, OnInit } from '@angular/core';
import { AlunosService } from '../alunos.service';
import { Router, ActivatedRoute } from '@angular/router';

import { Subscription } from 'rxjs';

@Component({
  selector: 'app-aluno-detalhe',
  templateUrl: './aluno-detalhe.component.html',
  styleUrls: ['./aluno-detalhe.component.css']
})
export class AlunoDetalheComponent implements OnInit {

  /* id que sera passado pro template através da interpolação */
  id: number;

  /* o subscription permite as informações do objeto para serem emitidas e serem ouvidas nos eventos */
  inscrito: Subscription;

  // variavel urso pra madnar através de rota imperativa
  aluno: any;

  /* fazendo a injeção de dependencia de tudo o que estamos utilizando
  cursosService - pra pegar o getCursos e a comparação de id pra saber qual id iremos apresentar
  Activated Route - informações para definir paremetros dentro da função de roteamento
  Router - todos os métodos que usaremos pra redirecionar rotas */
  constructor(private route: ActivatedRoute, private router: Router, private alunosService: AlunosService) { }

  ngOnInit() {
    /* inscrição recebendo os parametros da rota ativa sendo utilizada e fazendo um subscribe
    todo evento sendo emitido está sendo emitido pra todo mundo, mas só quem consegue receber é quem faz
    o subscribe, aonde estamos nos inscrevendo pra escuta o que está por vim */
    this.inscrito = this.route.params.subscribe(
      (params: any) => {
        this.id = params.id;

        /* nosso aluno está recebendo do alunoService as informações do getaluno passando nosso id,
        verificando se ele existe ou não */
        this.aluno = this.alunosService.getAluno(this.id);
         console.log(this.aluno);
        
         /* if pra verificar se o nosso aluno existe ou não.
        Se não existir o id do aluno sera direcionado para uma rota de nãoEncontrado */ 
        if (this.aluno == null){
            this.router.navigate(['/naoEncontrado']); 
        } 
      }
    );
  }

  ngOnDestroy() {
    this.inscrito.unsubscribe();
  }

}
