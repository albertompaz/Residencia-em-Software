import { Component, OnInit } from '@angular/core';
// importando FormGroup e das outras dependencias que usaremos, tipo FormBuild e HttpCliente usadsa no construtor
import { FormGroup, FormControl, FormBuilder } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-data-form',
  templateUrl: './data-form.component.html',
  styleUrls: ['./data-form.component.css']
})
export class DataFormComponent implements OnInit {

  /* Do tipo FormGroup que é a forma de extender informações do FormGroup pra criar formularios, fazendo
  o componente entender as iformações vinda do componente como um formulario */
  formulario: FormGroup;

  /* injeção de dependencia no construtor, as duas precisam fazer o import
  FormBuilder - É ele que faz a construção do formulario
  HttpClient - para as funções http, ex: get, post, pust, delete.... */
  constructor(private formBuilder: FormBuilder,
              private http: HttpClient) { }


  ngOnInit() {


    // VERSÃO MAIS VERBOSA, SEM USO DE FORMBUILDER
/*     this.formulario = new FormGroup({
      nome: new FormControl(null),
      nome: new FormControl(null)
    }); */

    // VERSÃO USANDO FORMBUILDER
    // Criação do nosso formulario
    // .group - é a função de agrupamento */
    this.formulario = this.formBuilder.group({
      nome: [null], //formControlName - é por causa dele que conseguimos identificar o nome do campo como 'nome'
      email: [null]
      // null pra dizer que estamos começando o formulario sem informação nenhuma
      // se colocace alguma informação aqui ja apareceria no seu formulario, como Brasil no campo país
      /* não precisa ser necessariamente informações estáticas, mas sim dinamicas, como uma alteração 
      de cadastro aonde algumas informações ja viria do servidor */
    });

  }

  /* formulario é a variavel que contem todos os dados do formulario passado */
  onSubmit(formulario) {
    /* realizando uma requisição http do tipo post */
    /* https://httpbin.org/post é a rota do site resttestest que simula um servidor */
    /* JSON.stringify(formulario.value))
    formulario.value pra pegar os valores das informações
    JSON.stringfy para transformar o campo em formato string, e depois em JSON
    o label for = "nome" é o nome como é passado pra reconhecer no banco de dados
    ai ficaria nome: <valor do campo do input> */
       this.http.post('https://httpbin.org/post', JSON.stringify(this.formulario.value))
       /* subscribe é o método que fara o link com o servidor e fara a requisição
       o subscribe é quando efetivamente eu to fazendo a requisição com o servidor */
         .subscribe(dados => {
           // console log pra vermos se os dados foram certo
           console.log(dados);
           // formulario.form.reset();
       });
     }

} 
