/* Programa para ser utilizado por uma loja de suprimentos de informática para representar uma fatura de um item vendido na loja.
 * Programador: Alberto Paz
 * Data: 09/12/2019 */

package App05;

//Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class Invoice {

	private int numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	// Calculando o preco total
	public double getInvoiceAmount (int quantidade, double preco) {
		return quantidade*preco;
	}
	
	// get e set dos atributos
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		// Se a quantidade for menor que zero, ela sera zero
		if (quantidade < 0) {
			this.quantidade = 0;
		} else {
			this.quantidade = quantidade;
		}
		
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		// Se o preco for menor que zero, ele sera zero
		if (preco < 0) {
			this.preco = 0;
		} else {
			this.preco = preco;
		}
	}


	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);
		
		
		// Criando o  objeto
		Invoice teste = new Invoice();
		// atribuindo valores ao atributos
		System.out.println("Informe o numero do item faturado: ");
		//.nextInt() pois ira receber um valor inteiro
		teste.setNumero(ler.nextInt());
		
		System.out.println("Informe a descrição do produto: ");
		//.next() pois ira receber um valor String
		teste.setDescricao(ler.next());
		
		System.out.println("Informe a quantidade faturada: ");
		teste.setQuantidade(ler.nextInt());
		
		System.out.println("Informe o preço: ");
		//.nextDouble() pois ira receber um valor Double
		teste.setPreco(ler.nextDouble());
		
		ler.close();
		
		// passando a quantidade e o preço no metodo para realizar o calculo
		System.out.println("O valor total a ser faturado é: "+teste.getInvoiceAmount(teste.getQuantidade(), teste.getPreco()));

	}

}
