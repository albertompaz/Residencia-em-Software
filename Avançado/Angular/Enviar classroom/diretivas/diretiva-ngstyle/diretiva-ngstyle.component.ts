import { Component, OnInit } from '@angular/core';
 
@Component({
  selector: 'app-diretiva-ngstyle',
  templateUrl: './diretiva-ngstyle.component.html',
  styleUrls: ['./diretiva-ngstyle.component.css']
})
export class DiretivaNgstyleComponent implements OnInit {

  /* criando variaveis para serem usadas no template */
  ativo = false;
  tamanhoFonte = 10;

  constructor() { }

  ngOnInit() {
  }

  /* função simplesmente para trocar o valor da variavel booleana */
  mudarAtivo() {
    this.ativo = !this.ativo;
  }

}
