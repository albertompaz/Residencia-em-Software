import { Component, OnInit } from '@angular/core';
import { ChamadasService } from '../chamadas.service';
import { Disciplina } from 'src/modulos/disciplina';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-disciplinas',
  templateUrl: './disciplinas.component.html',
  styleUrls: ['./disciplinas.component.css']
})
export class DisciplinasComponent implements OnInit {

  disciplinas: Disciplina[];

  //disciplinas2$: Observable<Disciplina[]>;

  constructor(private chamadas: ChamadasService) { 
  }

  ngOnInit() {
    /* this.chamadas.listarDisciplnas().subscribe(dados => this.disciplinas = dados);
    //this.disciplinas2$ = this.chamadas.listarDisciplnas();
    console.log(this.disciplinas); */
    //this.chamadas.listarDisciplnas().subscribe(dados => console.log(dados))
      //console.log(this.disciplinas)
    
      this.getDataFromService();
  }

  public getDataFromService() {
    //this.chamadas.listarDisciplnas().subscribe(dados => this.disciplinas = dados)
    //return console.log(this.disciplinas);
    if (localStorage.getItem("disciplinas") !== null) { // verificando se o local storage ta vazio ou não
      this.disciplinas = JSON.parse(localStorage.getItem("disciplinas"));
      console.log(this.disciplinas);
    }
  }

}
