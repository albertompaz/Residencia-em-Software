import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Pessoa } from 'src/modulos/pessoa';
import { tap } from 'rxjs/operators'
import { Endereco } from 'src/modulos/endereco';

@Injectable({
  providedIn: 'root'
})
export class EnderecosService {

  constructor(private http: HttpClient) { }

  listEndereco() {
    return this.http.get<Endereco[]>('http://localhost:3000/endereco/1');
  }

}
