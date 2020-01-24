//Definição de classe (geralmente classes tem primeira letra maiuscula)

class Conta {
    constructor () {
        this.nome_titular = null;
        this.numero_conta = null;
        this.saldo = 0;
    }
}

minhaConta = new Conta(); //cria um objeto da classe Conta

minhaConta.nome_titular = "Fulano da Silva"
minhaConta.numero_conta = 0020212
minhaConta.saldo = 230938.00
console.log(minhaConta);

outraConta = new Conta(); //cria um objeto da classe Conta
outraConta.nome_titular = 'Beltr Fernandes'
console.log(outraConta)