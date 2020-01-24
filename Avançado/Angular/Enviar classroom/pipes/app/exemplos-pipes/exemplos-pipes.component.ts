import { Component, OnInit } from '@angular/core';

import { interval } from 'rxjs';
import { map } from 'rxjs/operators';

@Component({
  selector: 'app-exemplos-pipes',
  templateUrl: './exemplos-pipes.component.html',
  styleUrls: ['./exemplos-pipes.component.css']
})
export class ExemplosPipesComponent implements OnInit {

  // dois modos: promise e observable

  // MÉTODO UTILIZANDO PROMISE
  /* metodo que a gente chama de promisse, resolve - valor que iremos receber, reject - valor que estivermos estipulando não combinar com o valor do promisse */
  valorAsync = new Promise((resolve, reject) => {
    /* o retorno da informaçao vai ser dada através do setTimeout com tempo de duração de 2s */
    setTimeout(() => resolve('Valor assíncrono'), 2000); // 2000 milissegundos = 2 segundos/
  });

  // MÉTODO UTILIZANDO OBSERVABLE  --  da biblioteca rxjs
  valorAsync2 = interval(2000) // tempo de 2000 milessegundos ou 2 segundos
  // função pipe que retorna um monte de informações dependendo do que especificamos
  // no nosso caso setamos a função map 
  .pipe(
    map(valor => 'Valor assíncrono 2')
  );


  constructor() { }

  livros: string[] = ['Java', 'Angular'];

  filtro: string;

  // criando um objeto livro 
  // pode ser puxado de um servidor, foi criado só como exemplo
  livro: any = {
    titulo: 'Learning JavaScript Data Structures and Algorithms 2nd ed',
    rating: 4.54321,
    numeroPaginas: 314,
    preco: 44.99,
    dataLancamento: new Date(2016, 5, 23),
    url: 'http://a.co/glqjpRP'
  };

  // função para adicionar o valor adicionado a lista pelo push
  addCurso(valor) {
    this.livros.push(valor);
    console.log(this.livros);
  }

  // método para retornar os cursos
  obterCursos() {

    // se for vazio ira retorna a lista vazia, se não for ele aplicará o filtro
    if (this.livros.length === 0 || this.filtro === undefined
    || this.filtro.trim() === '') {
      return this.livros;
    }

    // aplicando o filtro, passando as letras pra minuscula
    return this.livros.filter(
       v => v.toLocaleLowerCase().includes(this.filtro.toLocaleLowerCase())
    );
  }

  ngOnInit() {
  }

}
