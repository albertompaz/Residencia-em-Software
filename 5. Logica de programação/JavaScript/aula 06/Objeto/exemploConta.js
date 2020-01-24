//exemplo conta bancaria (objeto conta)

let conta = {
    //dados que a conta deve possuir:
    nome_titular: 'Fulano da Silva',
    numero_conta: 744321,
    saldo: 1500,
    //açoes que a conta deve oferecer
    mostra_saldo() {
        console.log('Saldo atual é ', this.saldo.toFixed(2));
    },
    depositar(valor) {
        this.saldo += valor;
        console.log('Foi depositado: ' + valor.toFixed(2));
        this.mostra_saldo();
    },
    sacar(valor) {
        this.saldo -= valor;
        console.log('Foi sacado: ' + valor.toFixed(2));
        this.mostra_saldo();
    }
};

conta.mostra_saldo();
conta.sacar(1000)
conta.depositar(2000);
