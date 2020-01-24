// criando nosso pipe customizado
import { Pipe, PipeTransform } from '@angular/core';

// decorator do nosso pipee para definir o pipe passado no template através do name
@Pipe({
  name: 'camelCase'
})

/* implementando uma interface do angular chamada PipeTransform que nos possibilita fazer a transformação */
export class CamelCasePipe implements PipeTransform {

  transform(value: any, args?: any): any {
    // split separa todas as palavras da fraze quando ele achar um espaço ' ' (nesse caso), poderia ser um traço: '-'
    let values = value.split(' ');
    let result = '';

    /* fazendo uma montagem das palavras */
    /* chamando a função captalize aonde ira captalizar as palavras transofrmadas e separado elas por espaço ' ' */
    for (let v of values){
      result += this.capitalize(v) + ' ';
    }

    return result;
  }

  // chamando o camptalize com o valor string
  capitalize(value: string){
    /* pegando as substrings - substr 
    0 ta pegando como substring apenas o primeiro elemento, que seria a primeira letra da palavra e colocando em maiuscula - toupperCase()
    1 que seria o resto da palavra esta passando pra minusculo - toLowerCase()
    */
    return value.substr(0,1).toUpperCase() +
      value.substr(1).toLowerCase();
  }

}
