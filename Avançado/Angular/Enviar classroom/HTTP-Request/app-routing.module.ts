import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CursosListaComponent } from './cursos-lista/cursos-lista.component';
import { CursosFormComponent } from './cursos-form/cursos-form.component';


const routes: Routes = 
// rota padrao pra quando se abrir o servidorno navegador
[{ path: '', component: CursosListaComponent },
  //rota pra criar um curso novo
  { path: 'novo', component: CursosFormComponent},
  // rota pra editar algum curso existente pelo id
  { path: 'editar/:id', component: CursosFormComponent}];

  // as duas rotas tao levando pro CursosFormComponent pois eles estão compartilhando o mesmo formulario
  // o formulario é igual, mas o evento que fara a função é diferente

@NgModule({
  // .forRoot pra ser global
  imports: [RouterModule.forRoot(routes)],
  // exportando nossas rota
  exports: [RouterModule]
})
export class AppRoutingModule { }
