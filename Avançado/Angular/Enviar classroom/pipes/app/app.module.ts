// importando nosso SettingsService
import { SettingsService } from './settings.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule, LOCALE_ID } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ExemplosPipesComponent } from './exemplos-pipes/exemplos-pipes.component';

/* importando o camelCasePipe que criamos */
import { CamelCasePipe } from './camel-case.pipe';

// para o input do filtro-arayfuncionar
import { FormsModule } from '@angular/forms';

// para reconhecer o locale
import { registerLocaleData } from '@angular/common';
import localePt from '@angular/common/locales/pt';
import { FiltroArrayPipe } from './filtro-array.pipe';
import { FiltroArrayImpuroPipe } from './filtro-array-impuro.pipe';

// registrando nosso tipo de locale a ser utilizado para, por exemplo, a data reconhecer o nosso tipo de data
registerLocaleData(localePt, 'pt');

// declarando os import
@NgModule({
  declarations: [
    AppComponent,
    ExemplosPipesComponent,
    CamelCasePipe,
    FiltroArrayPipe,
    FiltroArrayImpuroPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  // colocando nosso serviço em um provider pra dizer pro resto da aplicação que ele está disponivel para ser acessado
  providers: [
    // { provide: LOCALE_ID, useValue: 'pt' },
    SettingsService,
    {
      provide: LOCALE_ID,
      deps: [SettingsService],
      useFactory: (settingsService) => settingsService.getLocale()
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
