/* Programa para criar as classes Funcionario, Gerente e suas subclasses
 * Programador: Alberto Paz
 * Data: 11/12/2019 */

package app06;

public class Tecnico extends Assistente {
	
	private float bonusSalarial;

	// criando get e set dos atributos
	public float getBonusSalarial() {
		return bonusSalarial;
	}

	public void setBonusSalarial(float bonusSalarial) {
		this.bonusSalarial = bonusSalarial;
	}

	// sobreescrevendo o metodo para exibir dados
	public String exibeDados() {
		return "Tecnico [bonusSalarial=" + bonusSalarial + ", numMatricula=" + numMatricula + ", nome=" + nome
				+ ", idade=" + idade + ", salario=" + salario + "]";
	}

	
	
}
