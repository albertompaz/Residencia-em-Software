import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-data-form',
  templateUrl: './data-form.component.html',
  styleUrls: ['./data-form.component.css']
})
export class DataFormComponent implements OnInit {

  formulario: FormGroup;

  constructor(private formBuilder: FormBuilder,
              private http: HttpClient) { }


  ngOnInit() {


    // VERSÃO MAIS VERBOSA, SEM USO DE FORMBUILDER
/*     this.formulario = new FormGroup({
      nome: new FormControl(null),
      nome: new FormControl(null)
    }); */

    // VERSÃO USANDO FORMBUILDER
    this.formulario = this.formBuilder.group({
      nome: [null],
      email: [null]
    });

  }

 
  onSubmit() {

    this.http.post('https://httpbin.org/post', JSON.stringify(this.formulario.value))
    .subscribe(dados => {
      console.log(dados);
      // formulario.form.reset();
    });

  }

}
