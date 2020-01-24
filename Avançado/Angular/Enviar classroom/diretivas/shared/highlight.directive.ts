import { OnInit } from '@angular/core';

import { Directive, HostListener, HostBinding, Input } from '@angular/core';


@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {

    private backgroundColor;

    // @Input exponde os dados da nossa diretiva pra poder ser lido e associado pelo componente que estamos utilizando
    @Input() defaultColor = 'white';
    @Input('appHighlight') highlightColor = 'yellow';

    // alterando a cor com a entrada e saida do mouse
  @HostListener('mouseenter') onMouseOver() {
      this.backgroundColor = this.highlightColor;
  }

  @HostListener('mouseleave') onMouseLeave() {
    this.backgroundColor = this.defaultColor;
}


// SE NÃO PRECISAR DE MANIPULAÇÃO USA-SE A LINHA ABAIXO
/* @HostBinding('style.backgroundColor') backgroundColor: string; */

// SE PRECISAR DE MANIPULAÇÃO USA-SE A LINHA ABAIXO
// setando as cores
@HostBinding('style.backgroundColor') get setColor() {
  return this.backgroundColor;
}

constructor() {}

// pra se começar com uma cor, precisa se por dentro do ngOnInit
ngOnInit() {
  this.backgroundColor = this.defaultColor;
}


}
