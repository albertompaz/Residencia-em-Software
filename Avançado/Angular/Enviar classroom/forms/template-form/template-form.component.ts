import { Component, OnInit } from '@angular/core';
// importando o HttpClient pra realizar a injeção de dependencia
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-template-form',
  templateUrl: './template-form.component.html',
  styleUrls: ['./template-form.component.css']
})
export class TemplateFormComponent implements OnInit {

  // precisa da injeção do HttpClient para realizar as requisições http
  constructor(private http: HttpClient) { }

  ngOnInit() {
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
        this.http.post('https://httpbin.org/post', JSON.stringify(formulario.value))
        /* subscribe é o método que fara o link com o servidor e fara a requisição
        o subscribe é quando efetivamente eu to fazendo a requisição com o servidor */
          .subscribe(dados => {
            // console log pra vermos se os dados foram certo
            console.log(dados);
            // formulario.form.reset();
        });
      }

}
