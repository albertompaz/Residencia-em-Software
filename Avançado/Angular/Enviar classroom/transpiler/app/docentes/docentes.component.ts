import { Component, OnInit } from '@angular/core';
import { Pessoa } from 'src/modulos/pessoa';

@Component({
  selector: 'app-docentes',
  templateUrl: './docentes.component.html',
  styleUrls: ['./docentes.component.css']
})
export class DocentesComponent implements OnInit {

  pessoas: Pessoa[];

  constructor() { }

  ngOnInit() {
    if (localStorage.getItem("pessoas") !== null) { // verificando se o local storage ta vazio ou não
      this.pessoas = JSON.parse(localStorage.getItem("pessoas"));
      console.log(this.pessoas);
    }
  }

}
