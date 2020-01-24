//Parametro default
//se nenhum valor for passado na chamada da função entao o parametro recebe o valor padrao (default)
function oi_para(nome='Fulano') {
    console.log('Oi ',nome)
}

//chamada passando argumento
oi_para('Turma SERRATEC')
//chamada sem passar argumento
oi_para();