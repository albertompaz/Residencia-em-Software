import { Directive, ElementRef, Renderer2 } from '@angular/core';

@Directive({
  // fazendo funcionar somente com a tag paragrafo <p>
   selector: 'p[appFundoAmarelo]'

  // se eu quisesse fazer so pra botões: selector: 'button[appFundoAmarelo]'

  // sem nenhuma informação definida:
  //selector: '[appFundoAmarelo]'

})
export class FundoAmareloDirective {

  constructor(
    private elementRef: ElementRef, // faz referencia ao elemento dentro do template
    private renderer: Renderer2 // faz o ElementoRef sofrer algum tipo de alteração
  
  ) { 
    /* setStyle é uma função do Renderer
    ele pede 3 parametros
    1: referencia do nosso elemento, feita através do ElementRef 
    2: Quais as informações que ele alterarar
    3: qual a definição do style que está alterando*/
    this.renderer.setStyle(this.elementRef.nativeElement, 'background-color', 'yellow');
  }

}
