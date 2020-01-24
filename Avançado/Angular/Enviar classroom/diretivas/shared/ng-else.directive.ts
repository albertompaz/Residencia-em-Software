// Como usaremos o Input property, precisamos importar
import { Directive, Input, TemplateRef, ViewContainerRef } from '@angular/core';

@Directive({
  // tslint:disable-next-line: directive-selector
  selector: '[ngElse]'
})
export class NgElseDirective {

// utilizaremos um metodo de logica que se parece com a do else normal
// expondo essas informações com o @Input, setando o ngElse como um boolean que te retornara verdadeiro ou falso
  @Input() set ngElse(condition: boolean) {
    if (!condition) {
      // Renderizando a view contida no template
      // viewContainerRef -> todo conteudo html no documento
      // createEmbeddedView -> renderizando a view embutida no template
      this.viewContainerRef.createEmbeddedView(this.templateRef);
    } else { 
      // fazendo não mostrar nada
      this.viewContainerRef.clear();
    }
  }

  constructor(
    private templateRef: TemplateRef<any>,
    private viewContainerRef: ViewContainerRef) { }

}


