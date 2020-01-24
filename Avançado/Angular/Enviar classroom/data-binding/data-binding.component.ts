import { Component, OnInit } from '@angular/core';

@Component({
  // Pra carregar as informações do componente e o template pra dentro da pagina que sera exibida
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {

  // declarando a variavel url do tipo string
  url: String = 'http://www.serratec.com' // ou url = 'http://www.serratec.com'

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
  
    // criando um objeto, usando o tipo any pois ai voce pode colocar o tipo que quiser la dentro
    pessoa: any = {
      nome: 'def',
      idade: 20
    };
  
    valorInicial = 15;

    getValor() {
      return 1;
    }

    // criando um metodo que retornara true ao ser chamado
    getCurtirCurso() {
      return true;
    }

    // criando um metodo que acionara uma janela de alert na pagina html ao ser chamando pelo event-binding
  botaoClicado() {
    alert('Botão clicado');
  }

  // recebendo o evento, tecla ciclada

  onKeyUp(evento: KeyboardEvent) {
    // variavel vazia, puxando as informações que foi digitada no teclado
    // evento.target, pegando exatamente aquela letra digitada, e o valu seria o valor daquela letra
    this.valorAtual = (<HTMLInputElement> evento.target).value;
  }

  /* método para salvar o valor do campo vindo do template */
  salvarValor(valor) {
    this.valorSalvo = valor;
  }

  /* método que ta recebendo a negação da variavel booleana que declaramos anteriormente */
  onMouseOverOut() {
    this.isMouseOver = !this.isMouseOver;
  }

  onMudouValor(evento) {
    console.log(evento.novoValor);
  }

  /* a aplicação ja começa com as informações dentro do construtor */
  constructor() { }

  /* a ngOnInit é a primeiro método a ser chamando na sua aplicação */
  ngOnInit() {
  }

}
