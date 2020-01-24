/* Programa para simular uma criação de conta corrente para cliente normal e especial
 * Programador: Alberto Paz
 * Data: 10/12/2019 */

package app01;

//Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class Conta {

	private String nome;
	protected double saldo = 0;
	
	// get e set da classe
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	// operação sacar com taxa de 5% para cliente normal
	public void sacar(double valor) {
		// verificando se a pessoa possui o saldo para sacar
		if (valor > saldo) {
			System.out.println("Saldo insuficiente, operação nao realizada");
		} else {
			this.saldo -= valor*1.005;
		}
		
	}

	public void depositar(double valor) {
		// verificando se o valor passado é zero
		if (valor < 0) {
			this.saldo += 0;
		} else {
			this.saldo += valor;
		}
		
	}
	
	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);
        
        // for para o teste dos 2 tipos de conta
        for (int i=0; i<2; i++) {
        	System.out.println("Digite 1 para conta normal ou 2 para conta especial");
        	// .nextInt() pois ira receber um valor inteiro
        	int decisao = ler.nextInt();
        	
        	// if criar o objeto e preenchelo referente a escolha d usuario
        	if (decisao == 1) {
        		// criando o objeto Conta;
        		Conta c = new Conta();
        		
        		System.out.println("Informe o nome do titular: ");
        		// .net() pois ira receber uma string
        		c.setNome(ler.next());
        		
        		System.out.println("Informe um valor para depositar: ");
        		c.depositar(ler.nextDouble());
        		
        		System.out.println("Informe um valor para sacar: ");
        		c.sacar(ler.nextDouble());
        		
        		System.out.println("Saldo atual apos operações: "+ c.getSaldo());
        		
        	} else {
        		// criando o objeto Conta;
        		Conta ce = new ContaEspecial();
        		
        		System.out.println("Informe o nome do titular: ");
        		// .net() pois ira receber uma string
        		ce.setNome(ler.next());
        		
        		System.out.println("Informe um valor para depositar: ");
        		ce.depositar(ler.nextDouble());
        		
        		System.out.println("Informe um valor para sacar: ");
        		ce.sacar(ler.nextDouble());
        		
        		System.out.println("Saldo atual apos operações: "+ce.getSaldo());
        		
        	}
        }
        
        ler.close();

        System.out.println("------- Fim do Programa -------");
	}

}
