/* Programa para criar uma estrutura hieraarquica que contenha as seguintes classes: Veiculo, Automovel, Bicicleta
 * Programador: Alberto Paz
 * Data: 12/12/2019 */

package app07;

public class Bicicleta extends Veiculo {
	
	public Bicicleta() {
		System.out.println("Bicicleta");
	}

	// sobreescrevendo os metodos da classe pai
	public void listarVerificacoes() {
		System.out.println("Bicicleta.listarVerificacoes ");
	}

	public void ajustar() {
		System.out.println("Bicicleta.ajustar");
	}

	public void limpar() {
		System.out.println("Bicicleta.limpar");
	}
}
