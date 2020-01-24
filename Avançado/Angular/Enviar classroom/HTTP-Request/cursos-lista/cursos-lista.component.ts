import { Component, OnInit, ViewChild } from '@angular/core';
import { CursosService } from '../cursos/cursos.service';
import { Curso } from '../cursos/curso';
import { Router, ActivatedRoute } from '@angular/router';
import { BsModalRef, BsModalService } from 'ngx-bootstrap/modal';
import { Observable } from 'rxjs/internal/Observable';
import { Location } from '@angular/common';

@Component({
  selector: 'app-cursos-lista',
  templateUrl: './cursos-lista.component.html',
  styleUrls: ['./cursos-lista.component.css'],
  preserveWhitespaces: true
})
export class CursosListaComponent implements OnInit {

  // criando uma variael do tipo Curso que sera um array
  cursos: Curso[];

  // variavel pra ser a referencia do modal pra remover algum curso
  deleteModalRef: BsModalRef;

  // variavel pra ser nossa referencia de quem estamos manipulando
  cursoSelecionado: Curso;

  // chamando o modal que está no curso
  // @ViewChild pra a partir do componente fazer a busca da variavel local que está no nosso componente
  // static: true é elemento obrigatorio nesse caso
  @ViewChild('deleteModal', { static: true }) deleteModal;

  // injeção das dependencia do nosso construtor
  // CursosService pois nossas funções estão la dentro
  // Router pra termos as informações de rotas
  // ActivatedRoute pra ver qual é a rota que estou utilizando no momento
  // modalService para setar as informações do modal
  // location pra ver qual a situação da rota que estamos utilizando no momento
  constructor(private service: CursosService, private router: Router, private route: ActivatedRoute, private modalService: BsModalService, private location: Location) { }

  // todas as informações do formulario, jogamos no ngOnInit
  ngOnInit() {
    // pegando os dados da lista de cursos do nosso back-end e jogando na nossa variavel cursos
    this.service.list().subscribe(dados => this.cursos = dados);
  }

    // usando nossa rota de editar, através do id
    // relativeTo -> é em função a rota que está sendo utilizada no momento
    onEdit(id) {
      this.router.navigate(['editar', id], { relativeTo: this.route });
    }

    // usando nossa rota pra deletar
    onDelete(curso) {
      // atribuição de qual curso está sendo selecionado
      this.cursoSelecionado = curso;
      // abrindo a janela do nosso modal
      this.deleteModalRef = this.modalService.show(this.deleteModal, { class: 'modal-sm' });
    }

    // funções do modal de confirmar ou cancelar


    onConfirmDelete() {
      // função de remover aonde se ocorrer tudo certo ele ira remover e fechar a janela, se não ele informara uma mensagem de erro
      // pegando o id do curso e fazendo um subscribe no evento pra excluir
      this.service.remove(this.cursoSelecionado.id).subscribe(
        success => {
                      this.deleteModalRef.hide()
        },             
            error => alert("Erro ao remover registro. Tente novamente") 
      );
    }

    // para esconder o modal caso não desejamos excluir o item
    onDeclineDelete() {
      this.deleteModalRef.hide();
    }

}
