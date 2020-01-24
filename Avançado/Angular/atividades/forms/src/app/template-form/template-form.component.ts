import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-template-form',
  templateUrl: './template-form.component.html',
  styleUrls: ['./template-form.component.css']
})
export class TemplateFormComponent implements OnInit {

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

   onSubmit(formulario) {
        this.http.post('https://httpbin.org/post', JSON.stringify(formulario.value))
          .subscribe(dados => {
            console.log(dados);
            // formulario.form.reset();
        });
      }

}
