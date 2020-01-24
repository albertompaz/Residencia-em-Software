/* Programa para "controlar" um carro, suas troca de marcha, consumo, etc
 * Programador: Alberto Paz
 * Data: 09/12/2019 */

package App04;

public class Proprietario extends Endereco {
	
	private String nome;
	private String rg;
	private String dataDeNascimento;
	
	
	// Gerando Get e Set para os atributos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
		
}
