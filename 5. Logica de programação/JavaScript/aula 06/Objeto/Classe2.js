//definição da classe
//parametro saldo com valor 'default'
class Conta {
    constructor(nome, conta, saldo = 0) {
        this.nome_titula = nome; // atribui valor do parametro para a propriedade
        this.numero_conta = conta; // atribui valor do parametro para a propriedade
        this.saldo = saldo; // atribui valor do parametro para a propriedade
    }
};

//Passando valores para os parametros do construtor
minhaConta = new Conta('José', 123321, 100);
console.log(minhaConta);

//Passando valores para os parametrosdo construtor
outraConta = new Conta('João', 555999);
console.log(outraConta);

conta01 = new Conta();
conta01.nome_titula = 'alberto'
console.log(conta01)