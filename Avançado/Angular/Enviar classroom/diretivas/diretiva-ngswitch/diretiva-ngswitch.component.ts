import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-diretiva-ngswitch',
  templateUrl: './diretiva-ngswitch.component.html',
  styleUrls: ['./diretiva-ngswitch.component.css']
})
export class DiretivaNgswitchComponent implements OnInit {
 
  // Variavel qualquer pra saber qual aba eu estou selecionando, por padrão sera a home
  aba: string = 'home';

  constructor() { }

  ngOnInit() {
  }

}
