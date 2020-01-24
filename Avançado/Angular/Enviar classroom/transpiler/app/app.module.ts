import { FormsModule } from '@Angular/forms'
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { DocentesComponent } from './docentes/docentes.component';
import { DisciplinasComponent } from './disciplinas/disciplinas.component';
import { GradeDeHorariosComponent } from './grade-de-horarios/grade-de-horarios.component';
import { ContatoComponent } from './contato/contato.component';
import { PerfilComponent } from './perfil/perfil.component';
import { IndexComponent } from './index/index.component';
import { AuthService } from './login/auth.service';
import { HttpClientModule } from '@angular/common/http';
import { ChamadasService } from './chamadas.service';
import { EnderecosService } from './perfil/enderecos.service';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HeaderComponent,
    FooterComponent,
    DocentesComponent,
    DisciplinasComponent,
    GradeDeHorariosComponent,
    ContatoComponent,
    PerfilComponent,
    IndexComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [AuthService, ChamadasService, EnderecosService],
  bootstrap: [AppComponent]
})
export class AppModule { }
