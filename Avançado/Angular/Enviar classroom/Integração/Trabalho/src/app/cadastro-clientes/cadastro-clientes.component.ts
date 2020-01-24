import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { debounceTime } from 'rxjs/operators';
@Component({
  selector: 'app-cadastro-clientes',
  templateUrl: './cadastro-clientes.component.html',
  styleUrls: ['./cadastro-clientes.component.css']
})
export class CadastroClientesComponent implements OnInit {
  formCadastro: FormGroup;
  valoresForm: Object;

  constructor(private fb: FormBuilder) {

   }

  ngOnInit() {
    this.formCadastro = this.fb.group({
      nome: [null],
      cpf: [null],
      email: [null],
      telefone: [null],
      endereco: [null]
    });

    this.formCadastro.valueChanges.pipe(
      debounceTime(1000))
      .subscribe(res => {
        console.log(res);
        this.valoresForm = res;
      });
  }

  cadastro(){
    //this.conversao = JSON.stringify(this.valoresForm);
    //console.log(this.conversao);
    console.log(JSON.stringify(this.valoresForm));
    localStorage.setItem('cadastro', JSON.stringify(this.valoresForm));
   }

}
