/* importando o angular core, que é um baixo nivel de serviço e utilidades. É ele que define a estrutura 
dos componentes, hirarquia, detecta mudanças, renderiza, etc */ 
import { Component } from '@angular/core';

// criando um componente
@Component({
    // selector: nome do componente pra ser chamando no template
    selector: 'meu-primeiro-component',
    // template: html imcorporado ao componente, nesse caso ja escrevendo aqui mesmo
    template: `<p>Meu primeiro component com Angular</p>`
})

// exportando o componente para ser chamando depois
export class MeuPrimeiroComponent {}

