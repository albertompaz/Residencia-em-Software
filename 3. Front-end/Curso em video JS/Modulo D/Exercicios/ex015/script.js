function verificar() {
    var data = new Date()
    var ano = data.getFullYear() //FullYear é para pegar o ano com 4 digitos
    var fano = document.getElementById('txtano')
    var res = document.querySelector('div#res')

    if(fano.value.length == 0 || Number(fano.value) > ano) {
        window.alert('[ERRO] Verifique os dados e tente novamente!')
    } else {
        var fsex = document.getElementsByName('radsex')
        var idade = ano - Number(fano.value)
        var genero = ''
        var img = document.createElement('img')
        img.setAttribute('id', 'foto') // como se fosse na mao no html e criasse um <img id='foto'>

        if (fsex[0].checked) { //[0]masculino [1] feminino, o checked é pra ver se ta marcado
            genero = 'Homem'
            if(idade >=0 && idade <10) {
                //criança
                img.setAttribute('src', 'bebehomem.jpg')
                img.setAttribute('border-radius', '50%')
                img.setAttribute('width', '250px')
                img.setAttribute('height', '250px')
                //atribui os atributos assim ou vai no css e por la e tira daqui
            } else if (idade < 21) { // pode omiti o idade >= 10
                //jovem
                img.setAttribute('src', 'homemjovem.jpg')
                img.setAttribute('border-radius', '50%')
                img.setAttribute('width', '250px')
                img.setAttribute('height', '250px')
            } else if (idade < 50) { //pode omitir o idade >= 21
                //adulto
                img.setAttribute('src', 'homemadulto.jpg')
                img.setAttribute('border-radius', '50%')
                img.setAttribute('width', '250px')
                img.setAttribute('height', '250px')
            } else {
                //idoso
                img.setAttribute('src', 'homemvelho.jpg')
                img.setAttribute('border-radius', '50%')
                img.setAttribute('width', '250px')
                img.setAttribute('height', '250px')
            }
        } else if (fsex[1].checked){ // poderia so usar o else
            genero = 'Mulher'
            if(idade >=0 && idade <10) {
                //criança
                img.setAttribute('src', 'bebemulher.jpg')
                img.setAttribute('border-radius', '50%')
                img.setAttribute('width', '250px')
                img.setAttribute('height', '250px')
            } else if (idade < 21) { // pode omiti o idade >= 10
                //jovem
                img.setAttribute('src', 'mulherjovem.jpg')
                img.setAttribute('border-radius', '50%')
                img.setAttribute('width', '250px')
                img.setAttribute('height', '250px')
            } else if (idade < 50) { //pode omitir o idade >= 21
                //adulto
                img.setAttribute('src', 'mulheradulta.jpg')
                img.setAttribute('border-radius', '50%')
                img.setAttribute('width', '250px')
                img.setAttribute('height', '250px')
            } else {
                //idoso
                img.setAttribute('src', 'mulhervelha.jpg')
                img.setAttribute('border-radius', '50%')
                img.setAttribute('width', '250px')
                img.setAttribute('height', '250px')
            }
        }
        res.style.textAlign = 'center'
        res.innerHTML = `Detectamos ${genero} com ${idade} anos.`
        res.appendChild(img)
    }


}