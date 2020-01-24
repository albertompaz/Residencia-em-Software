import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Pessoa } from 'src/modulos/pessoa';
import { tap, delay } from 'rxjs/operators'
import { Endereco } from 'src/modulos/endereco';
import { Disciplina } from 'src/modulos/disciplina';


@Injectable({
  providedIn: 'root'
})
export class ChamadasService {

  constructor(private http: HttpClient) { }

  list() {
    return this.http.get<Pessoa[]>('http://localhost:3000/pessoas');
  }

  listEndereco() {
    return this.http.get<Endereco[]>('http://localhost:3000/endereco').pipe(
      tap(console.log)
    );
  }
 
  listarDisciplnas() {
    return this.http.get<Disciplina[]>('http://localhost:3000/disciplina');
  }
  
}
