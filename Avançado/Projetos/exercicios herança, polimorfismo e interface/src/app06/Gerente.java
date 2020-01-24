/* Programa para criar as classes Funcionario, Gerente e suas subclasses
 * Programador: Alberto Paz
 * Data: 11/12/2019 */

package app06;

public class Gerente extends Funcionario{
	
	private String setor;
	
	// criando get and set
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	// sobreescrevendo o metodo para exibir dados
	public String exibeDados() {
		return "Gerente [setor=" + setor + ", nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
	}
	

}
