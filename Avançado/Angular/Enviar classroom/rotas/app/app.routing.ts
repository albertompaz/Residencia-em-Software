/* importes relativos ao componentes que usaremos no nosso projeto */
import { InfoNaoEncontradaComponent } from './info-nao-encontrada/info-nao-encontrada.component';
import { PaginaNaoEncontradaComponent } from './pagina-nao-encontrada/pagina-nao-encontrada.component';
import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { CursosComponent } from './cursos/cursos.component';
import { LoginComponent } from './login/login.component';
import { CursoDetalheComponent } from './curso-detalhe/curso-detalhe.component';

import { AlunosComponent } from './alunos/alunos.component';
import { AlunoDetalheComponent } from './alunos/aluno-detalhe/aluno-detalhe.component';
import { getLocaleMonthNames } from '@angular/common';

/* No caso de rotas a rota importa e muito!!
cursos/:id deve ser depois de cursos por exemplo
uma rota de cadastrar novo curso, deve vim antes do detalhamento por exemplo */

/* Criando uma array constante do tipo Routes aonde terá todas as informações necessarias para 
carregar nossos componentes*/
const APP_ROUTES: Routes = [
    /* caminho da rota - componente da rota */
    // todos esses componentes que estão sendo usados precisam ser importados
    { path: 'cursos', component: CursosComponent },
    // Assim os conteudos sao independentes
    { path: 'curso/:id', component: CursoDetalheComponent },
    { path: 'login', component: LoginComponent },
    { path: 'home', component: HomeComponent },
    /* Assim os conteudos são dependentes, usando o padrão de rotas filhas. Aonde a filha é dependente da 
    rota principal, funcionando em função da rota principal. */
    { path: 'alunos', component: AlunosComponent , children : [
        // Rota filha
        { path: ':id', component: AlunoDetalheComponent }
    ]}, 
    // Rota pra informara que alguma informação não é valida, não foi achado
    { path: 'naoEncontrado', component: InfoNaoEncontradaComponent },
    // Rota padrão - (vazio '') aonde estamos dizendo que a nossa pagina inicial sera a pagina login
    { path: '', redirectTo: '/login', pathMatch: 'full' },
    /* WildCard - ('**') -> definindo que qualquer coisa que seja diferente do que definimos como uma 
    rota que carregara um coponente será enviado para PaginaNaoEncontradaComponent */
    { path: '**', component: PaginaNaoEncontradaComponent }
];

// exportação da informação de routing
 /* ModuleWithProviders - gerando um modulo de roteamente que ira prover um serviço de distribuição de rotas.
 É através dele que conseguimos definir que routing ta definindo uma informação de modulo de rotas */
export const routing: ModuleWithProviders = RouterModule.forRoot(APP_ROUTES);

/* forRoot - quando estamos definindo nosso escopo de rotas dentro de um modulo raiz
   forChild - quando estamos definindo nosso escopo getLocaleMonthNames, sendo as rotas só escutadas através
              do componente filho */