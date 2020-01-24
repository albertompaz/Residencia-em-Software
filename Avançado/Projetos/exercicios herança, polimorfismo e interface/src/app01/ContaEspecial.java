/* Programa para simular uma criação de conta corrente para cliente normal e especial
 * Programador: Alberto Paz
 * Data: 10/12/2019 */

package app01;

public class ContaEspecial extends Conta {
	
	// operação sacar com taxa de 1% para cliente especial
	public void sacar(double valor) {
		// verificando se a pessoa possui o saldo para sacar
		if (valor > saldo) {
			System.out.println("Saldo insuficiente, operação nao realizada");
		} else {
			this.saldo -= valor*1.001;
		}
	}
	
}
