import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TemplateFormComponent } from './template-form/template-form.component';
import { DataFormComponent } from './data-form/data-form.component';

// configuração das rotas
const routes: Routes = [
  { path: 'templateForm', component: TemplateFormComponent },
  { path: 'dataForm', component: DataFormComponent },
  // configuração padrao para abertura do site
  { path: '', pathMatch: 'full', redirectTo: 'dataForm' }
]; 

@NgModule({
  // for root pois não tem nada de implementação dos filhos
  imports: [RouterModule.forRoot(routes)],
  // exportação pro app componente visualizar as rotas
  exports: [RouterModule]
})
export class AppRoutingModule { }
