import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

// importação de tudo o que ta alocado no app.module
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CursosFormComponent } from './cursos-form/cursos-form.component';
import { CursosListaComponent } from './cursos-lista/cursos-lista.component';
import { CursosService } from './cursos/cursos.service';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { BsModalService, ModalModule } from 'ngx-bootstrap/modal';

@NgModule({
  declarations: [
    AppComponent,
    CursosFormComponent,
    CursosListaComponent
  ],
  imports: [
    BrowserModule,
    // conseguir utilizar as informações do modulo
    AppRoutingModule,
    // permitir usar o crud
    HttpClientModule,
    // para conseguir criar formularios data-forms
    ReactiveFormsModule,
    // para conseguir fazer a janela de confirmação na hora de excluir
    ModalModule.forRoot()
  ],
  // BsModalService para o ModalModule
  providers: [CursosService, BsModalService],
  bootstrap: [AppComponent]
})
export class AppModule { }
