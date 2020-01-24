/* Programa para criar as classes Funcionario, Gerente e suas subclasses
 * Programador: Alberto Paz
 * Data: 11/12/2019 */

package app06;

public class Assistente extends Funcionario {
	
	protected int numMatricula;
	
	// criando get e set
	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	// sobreescrevendo o metodo para exibir dados
	public String exibeDados() {
		return "Assistente [numMatricula=" + numMatricula + ", nome=" + nome + ", idade=" + idade + ", salario="+ salario + "]";
	}
	
	
}
