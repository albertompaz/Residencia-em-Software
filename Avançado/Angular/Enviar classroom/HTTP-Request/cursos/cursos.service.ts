
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Curso } from './curso';
// importando os operadores do rxjs
import { tap, delay, take } from 'rxjs/operators';
import { environment } from '../../environments/environment';

@Injectable({
    providedIn: 'root'
  })
  export class CursosService {

    /* variavel readonly, pois assim ela não pode ser atualizada 
    ela contera o nosso endereço do backend*/
    private readonly API = 'http://localhost:3000/cursos';

    // injetando dependencia HttpClient no nosso construtor pra podermos fazer o CRUD
    constructor(private http: HttpClient) { }

    list() {
      // usando um get pra pegar os dados dos cursos contido no nosso back-end
        return this.http.get<Curso[]>(this.API)
          .pipe(
            //  pipe é um operador do rxjs, ele é um repositorio das informações do observable
            //  delay(2000),
            tap(console.log)
            // tap é um operador do rxjs
            // tap é um comando que manda as informações do get<curso[]> para o console.log
          );
      }

    // O loadById tem 2 funções:
    // - método para carregar um curso pelo id dele
    /* - é ele que vai nos informa se faremos um update ou um post no nosso formulario,
    aonde através de um if, se ele achar um id ele fara o update, e se não achar ele fara um create */
    loadByID(id) {
      // $ pra dizermos que queremos pegar informação do nosso template
      /* pipe(take(1)), pois só faremos uma busca ao servidor, depois do servidor mandar essa resposta 
      ele fara o unsubscribe fechando a conexão */
      return this.http.get(`${this.API}/${id}`).pipe(take(1));
    }

    // método pra criar um novo curso
    // this.http.post(this.API, curso) -> pois estamos passando o endereço, e o curso que iremos criar
    create(curso) {
      return this.http.post(this.API, curso).pipe(take(1));
    }

    // função para atualizar um curso
    update(curso) {
      return this.http.put(`${this.API}/${curso.id}`, curso).pipe(take(1));
    }

    // função para remover um curso
    remove(id) {
      return this.http.delete(`${this.API}/${id}`).pipe(take(1));
    }

  }