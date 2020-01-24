import { Component, OnInit, Input, Output, ViewChild, EventEmitter, ElementRef } from '@angular/core';

@Component({
  selector: 'app-contador',
  templateUrl: './output-property.component.html',
  styleUrls: ['./output-property.component.css']
})
export class OutputPropertyComponent implements OnInit {

  @Input() valor = 0;

   /* Input expoe para ser utilizado para o elemento pai, o output é o contrario */
  
   /* Output é um decorator usando nesse caso pra pegar o event-binding crido no pai, aonde
   ele ira carregar o evento de decremento e incremento contigo no filho. */

   /* EventEmitter é uma classe aonde tem funções para emetir os eventos, aonde usaremos uma dessas
   funções posteriormente */
  @Output() mudouValor: any = new EventEmitter();

  /* ViewChild é usado pra variavel local 'campoInput' do componente filho ser "enchergaddo" pelo componente pai */
  @ViewChild('campoInput', {static: true}) campoValorInput: ElementRef;

  incrementa() {
    // fazendo o incremento do numero
    this.campoValorInput.nativeElement.value++;

    // passando o valor atual para ser mostrado
    this.mudouValor.emit({novoValor: this.valor});
  }

  decrementa() {
    /* nativeElement é uma  função da classe do ElementRef que só pega o valor das informações */ 
    this.campoValorInput.nativeElement.value--;

    /* .emit é uma função da classe EventEmitter para mostrar esse valor*/
    this.mudouValor.emit({novoValor: this.valor});
  }

  constructor() { }

  ngOnInit() {
  }

}
