/* Programa para criar uma agenda de contatos
 * Programador: Alberto Paz
 * Data: 09/12/2019 */

package App02;

public class Contato {
	
	private String nome;
	private int telefone;
	private String email;
	
	// gerando get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
