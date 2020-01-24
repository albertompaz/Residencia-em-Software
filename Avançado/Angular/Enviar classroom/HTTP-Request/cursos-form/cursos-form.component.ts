import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { CursosService } from '../cursos/cursos.service';
import { Location } from '@angular/common';
import { ActivatedRoute } from '@angular/router';
import { map, switchMap, exhaustMap } from 'rxjs/operators';
import { observable } from 'rxjs';

@Component({
  selector: 'app-cursos-form',
  templateUrl: './cursos-form.component.html',
  styleUrls: ['./cursos-form.component.css']
})
export class CursosFormComponent implements OnInit {

  // variavel pra receber as informações do nosso formulario, do template
  // FormGroup
  form: FormGroup;

  // false pois ainda não submetemos nada
  submitted = false

  // injeção de dependencias no nosso construtor
  // FormBuilder - construtor do formulario
  // CursosService - pra usarmos o put e o post
  // Location pra conseguirmos especificar funções através do nosso html
  // Routes pra saber a rota que estamos usando no momento
  constructor(private fb: FormBuilder, private service: CursosService, private location: Location, private route: ActivatedRoute) { }


  ngOnInit() {
      // pegando os parametros de rota, pra identificarmos se o id existe ou não
      this.route.params
      .pipe(
        map((params: any) => params['id']),
        // switchMap - permite a partir de um função observable, acessar outra função observable
        // através do pipe (observable), acessa a função loadbyId (observable)
        switchMap(id => this.service.loadByID(id))
      )
      // subscribe pra fazer o update do formulario
      .subscribe(curso => this.updateForm(curso));
        
    // inicializando nosso formularo com id e nome como null
    // passando as informações de validações para o campo nome, com nome requerido, caracteres minimos e maximos
    this.form = this.fb.group({
      id: [null],
      nome:[null, [Validators.required, Validators.minLength(3), Validators.maxLength(20)]]
    });
  }

  // atualização do curso pegando a variavel curso
  updateForm(curso) {
    this.form.patchValue({
      // pegando os campos do curso
      id: curso.id,
      nome: curso.nome
    })
  }

  // função pra tratamento dos erros no input de nome
  hasError(field: string) {
    return this.form.get(field).errors;
  }
  
  // função que sera chamado na hora de clicar no salvar
  onSubmit() {
    // mudando o valor da variavel booleana pra permitir ele ser submetido
    this.submitted = true;
    console.log(this.form.value);
    // verificando se o formulario ta valido
    if (this.form.valid) {
      console.log('submit');
      // if pra ver se o formulario tem um id, aonde se ele tiver id fara uma função de update
      if (this.form.value.id) {
        this.service.update(this.form.value).subscribe(
          success => { 
          alert('Update Completo'),
          // this.location.back() -> para voltarmos pra rota anterior
            this.location.back();
          },
          error => alert('Erro ao atualizar o curso, tente novamente')  
        );
        // se não possuir um id, ele fara uma função de create
      } else { 
        this.service.create(this.form.value).subscribe(
          success => { 
            alert('Curso criado com sucesso!!'),
            this.location.back();
          },
          error => alert(error)  
        );
      }

    }

  }

  // função para se clicarmos no botão calcel
  onCancel() {
    // colocando pra falso pra cancelarmos a submissão
    this.submitted = false;
    // ele resetara as informações do input
    this.form.reset();
   console.log('onCancel');
  }
}
