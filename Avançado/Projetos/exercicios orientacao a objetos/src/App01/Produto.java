/* Programa para gerenciar os produtos de uma loja
 * Programador: Alberto Paz
 * Data: 09/12/2019 */

package App01;

public class Produto {
	
	private int item;
	private double preco;
	private int quantidadeEstoque;
	
	// metodo para alterara a quantidade em estoque
	public void alteraEstoque(int numero) {
		quantidadeEstoque -= numero;
	}
	
	// criando get em set para os atributos
	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	

}
