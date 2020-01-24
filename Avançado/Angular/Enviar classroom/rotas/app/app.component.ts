import { Component } from '@angular/core';
import { AuthService } from './login/auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'rotas';

  // variavel mostrar menu como falsa por padrao
  mostrarMenu = false;

  constructor(private authService: AuthService) {}

  ngOnInit(): void {
    // se escrevendo pra escutar o evendo emitido
    this.authService.mostrarMenuEmitter.subscribe(
      // alterando o valor da variavel booleana do mostrarMenu
      mostrar => this.mostrarMenu = mostrar
    );
    
  }
}
