function funcJS(form_html) {
    //acessa o elemento pelo campo name do input que esta dentro do <form>
    console.log('funcJS');
    form_html.saida_dados.value = form_html.entrada_dados.value;
}

function funcJS_ById() {
    //acessa o elemento diretamente pelo campo id
    console.log('funcJS_ById');
    document.getElementById('id_saida_dados').value = document.getElementById('id_entrada_dados').value;
}

// as duas funções fazem as mesmas coisas. Mas uma pega pelo id e a outra pelo name