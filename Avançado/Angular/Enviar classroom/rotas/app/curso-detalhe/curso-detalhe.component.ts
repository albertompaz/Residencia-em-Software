import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

// import de subscription
import { Subscription } from 'rxjs';

import { CursosService } from '../cursos/cursos.service';

@Component({
  selector: 'app-curso-detalhe',
  templateUrl: './curso-detalhe.component.html',
  styleUrls: ['./curso-detalhe.component.css']
})
export class CursoDetalheComponent implements OnInit {

  /* id que sera passado pro template através da interpolação */
  id: number;

  /* o subscription permite as informações do objeto para serem emitidas e serem ouvidas nos eventos */
  inscricao: Subscription;

  // variavel urso pra madnar através de rota imperativa
  curso: any;

  /* fazendo a injeção de dependencia de tudo o que estamos utilizando
  cursosService - pra pegar o getCursos e a comparação de id pra saber qual id iremos apresentar
  Activated Route - informações para definir paremetros dentro da função de roteamento
  Router - todos os métodos que usaremos pra redirecionar rotas */
  constructor( private route: ActivatedRoute, private router: Router, private cursosService: CursosService ) { 
    // this.id = this.route.snapshot.params['id'];
  }

  ngOnInit() {
    /* inscrição recebendo os parametros da rota ativa sendo utilizada e fazendo um subscribe
    todo evento sendo emitido está sendo emitido pra todo mundo, mas só quem consegue receber é quem faz
    o subscribe, aonde estamos nos inscrevendo pra escuta o que está por vim */
    this.inscricao = this.route.params.subscribe(
      (params: any) => {
        this.id = params.id;

        /* nosso curso está recebendo do cursoService as informações do getCurso passando nosso id,
        verificando se ele existe ou não */
        this.curso = this.cursosService.getCurso(this.id);

        /* if pra verificar se o nosso curso existe ou não.
        Se não existir o id do curso sera direcionado para uma rota de nãoEncontrado */ 
        if (this.curso == null){
            this.router.navigate(['/naoEncontrado']); 
        } 
      }
    );
  }

  // função para desinscrever o objeto inscricao para deixar de escutar os eventos
  ngOnDestroy() {
    this.inscricao.unsubscribe();
  }

}
