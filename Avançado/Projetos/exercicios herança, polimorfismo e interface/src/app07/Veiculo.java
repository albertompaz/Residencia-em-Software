/* Programa para criar uma estrutura hieraarquica que contenha as seguintes classes: Veiculo, Automovel, Bicicleta
 * Programador: Alberto Paz
 * Data: 12/12/2019 */

package app07;

public abstract class Veiculo {

	public Veiculo() {
		System.out.print("Veiculo");
	}

	// adicionando metodos abstratos pedidos
	public abstract void listarVerificacoes();

	public abstract void ajustar();

	public abstract void limpar();

}
