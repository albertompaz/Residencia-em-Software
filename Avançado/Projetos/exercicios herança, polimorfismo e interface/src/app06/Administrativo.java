/* Programa para criar as classes Funcionario, Gerente e suas subclasses
 * Programador: Alberto Paz
 * Data: 11/12/2019 */

package app06;

public class Administrativo extends Assistente {

	private String turno;
	private float adicionalNoturno;
	
	// criando get and set dos atributos
	public String getTurno() {
		return turno;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public float getAdicionalNoturno() {
		return adicionalNoturno;
	}
	
	public void setAdicionalNoturno(float adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}

	// sobreescrevendo o metodo para exibir dados
	public String exibeDados() {
		return "Administrativo [turno=" + turno + ", adicionalNoturno=" + adicionalNoturno + ", numMatricula="
				+ numMatricula + ", nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
	}
	
	
}
