/* precisa importar ele no app.mldule.ts */

import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  // nome do pipe para ser utilizado no template
  name: 'filtroArray',
  // definindo ele como puro
  pure: true
})
export class FiltroArrayPipe implements PipeTransform {

  // método para filtrar o array de lista, através do pipe filtro-array
  transform(value: any, args?: any): any {
    /* se o alor for igual a zero ele ira retorna ele */
    if (value.length === 0 || args === undefined) {
      return value;
    }

    // função para realizar o filtro
    // toLocaleLowerCase() -> deixa todas sa palavras em minusculas pra evitar um filtro pra cada tipo de escrita
    let filter = args.toLocaleLowerCase();
    return value.filter(
      // colocando todo mundo para lowerCase e incluindo ela no filter
      v => v.toLocaleLowerCase().includes(filter)
    );
  }

}

