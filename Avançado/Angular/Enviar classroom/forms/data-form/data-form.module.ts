/* pro data-form funcionar precisa do ReactiveFormsModule, e ele funciona em função de um modulo usado no dataForm */

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DataFormComponent } from './data-form.component';

/* importo do ReactiveFormsModule */
import { ReactiveFormsModule } from '@angular/forms';
import { format } from 'url';

/* tirou o DataFormComponente da declaração do appModule e colocou aqui internamente, aonde o appModule
ira importar o data-format.module */
@NgModule({
  declarations: [
    DataFormComponent
  ],
  imports: [
    // CommonModule pois sera local e não global
    CommonModule,
    // colocando ele no import, ele que faz o reconhecimento das funções de criações do formulario do data-form
    ReactiveFormsModule
  ]
})
export class DataFormModule { }
