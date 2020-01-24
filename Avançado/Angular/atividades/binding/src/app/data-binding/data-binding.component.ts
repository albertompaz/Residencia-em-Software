import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {

  // criando uma variavel, defenndo o tipo dela e o conteudo string
  url: String = 'http://serratec.com';

  // criando outra variavel mas agora do tipo boolean
  cursoAngular: boolean = true;

  // criando uma variavel, mas sem declarar o tipo, fazendo o ts defenir o tipo
  urlImagem = 'http://lorempixel.com/400/200/nature/';

  // criando variaveis
  valorAtual: string = '';

  valorSalvo;

  isMouseOver: boolean = false;

  nomeDoCurso: string = 'Angular';

  nome: string = 'abc';

  // criando um objeto
  pessoa: any = {
    nome: 'def',
    idade: 20
  };

  valorInicial = 15;

  // criando um metodo que retornara um ao ser chamado
  getValor() {
    return 1;
  }

  // criando um metodo que retornara true ao ser chamado
  getCurtirCurso() {
    return true;
  }

  // criando um metodo que acionara uma janela de alert na pagina html
  botaoClicado() {
    alert('Botão clicado');
  }

  onKeyUp(evento: KeyboardEvent) {
    this.valorAtual = (<HTMLInputElement> evento.target).value;
  }

  salvarValor(valor) {
    this.valorSalvo = valor;
  }

  onMouseOverOut() {
    this.isMouseOver = !this.isMouseOver;
  }

  onMudouValor(evento) {
    console.log(evento.novoValor);
  }

  constructor() { }

  ngOnInit() {
  }

}
