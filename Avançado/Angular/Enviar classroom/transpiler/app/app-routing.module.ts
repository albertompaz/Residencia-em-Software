import { PerfilComponent } from './perfil/perfil.component';
import { GradeDeHorariosComponent } from './grade-de-horarios/grade-de-horarios.component';
import { DocentesComponent } from './docentes/docentes.component';
import { DisciplinasComponent } from './disciplinas/disciplinas.component';
import { ContatoComponent } from './contato/contato.component';
import { IndexComponent } from './index/index.component';
import { LoginComponent } from './login/login.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


const routes: Routes = [
  { path: 'contato', component: ContatoComponent },
  { path: 'disciplinas', component: DisciplinasComponent },
  { path: 'docentes', component: DocentesComponent },
  { path: 'grade-de-horarios', component: GradeDeHorariosComponent },
  { path: 'index', component: IndexComponent },
  { path: 'perfil', component: PerfilComponent },
  { path: '', component: LoginComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
