import { Pipe, PipeTransform } from '@angular/core';
import { FiltroArrayPipe } from './filtro-array.pipe';

// definindo o nome e se é puro ou não
@Pipe({
    name: 'filtroArrayImpuro',
    // por padrão o pipe vem como puro, pure: true
    pure: false
  })

  // herdando do FiltroArrayPipe que é o nosso pipe puro, herdando tudo o que tem la dentro de função
  export class FiltroArrayImpuroPipe extends FiltroArrayPipe {

  }
