/* Programa para criar uma estrutura hieraarquica que contenha as seguintes classes: Veiculo, Automovel, Bicicleta
 * Programador: Alberto Paz
 * Data: 12/12/2019 */

package app07;

public class Automovel extends Veiculo {
	
	public Automovel() {
		System.out.println("Automovel");
	}

	// sobreescrevendo os metodos da classe pai
	public void listarVerificacoes() {
		System.out.println("Automovel.listarVerificacoes ");
	}

	public void ajustar() {
		System.out.println("Automovel.ajustar ");
	}

	public void limpar() {
		System.out.println("Automovel.limpar ");
	}

	public void mudarOleo() {
		System.out.println("Automovel.mudouOleo");
	}

}