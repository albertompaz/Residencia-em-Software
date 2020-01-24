/* Programa para criar as classes Funcionario, Gerente e suas subclasses
 * Programador: Alberto Paz
 * Data: 11/12/2019 */

package app06;

public class Funcionario {
	
	protected String nome;
	protected int idade;
	protected float salario;
	
	// criando get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	// metodo para exibição de dados
	public String exibeDados() {
		return "Funcionario [nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
	}
	
	
}
