
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
/* OBS!!! FormsModule precisa importar pra usar o ngModel, pois a aplicação não informa o erro */
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TemplateFormComponent } from './template-form/template-form.component';


import { DataFormModule } from './data-form/data-form.module';

@NgModule({
  declarations: [
    AppComponent,
    TemplateFormComponent,
  ],
  // importações de tudo o que estamos utilizando, pro template ou data driven
  imports: [
  BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    AppRoutingModule,
    DataFormModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
