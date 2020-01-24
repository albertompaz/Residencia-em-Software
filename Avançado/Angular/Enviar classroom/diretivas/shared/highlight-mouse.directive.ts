
import { Directive, HostListener, ElementRef, Renderer2, HostBinding } from '@angular/core';

@Directive({
  selector: '[appHighlightMouse]'
})
export class HighlightMouseDirective {

  constructor(
    private elementRef: ElementRef,
    private renderer: Renderer2) { }
    private backgroundColor;

  // @HostListener pra fazer o evento conseguir escutar o que ta acontecendo no template
  // nesse caso ele esta escutando o mouseenter  
  @HostListener('mouseenter') onMouseOver() {
      // alterando a cor do background
      this.backgroundColor = 'yellow';
  }

  @HostListener('mouseleave') onMouseLeave() {
    this.backgroundColor = 'white';
}

// SE NÃO PRECISAR DE MANIPULAÇÃO USA-SE A LINHA ABAIXO
/* @HostBinding('style.backgroundColor') backgroundColor: string; */

// // SE PRECISAR DE MANIPULAÇÃO USA-SE A LINHA ABAIXO
//@HostBinding ela faz a associação da logica que estamos criando da nossa diretiva para a logica dentro do template
@HostBinding('style.backgroundColor') get setColor() {
  return this.backgroundColor;
}

/* @HostListener meio que muda a cor, e o @HostBinding manda ele apricar a cor */

}
