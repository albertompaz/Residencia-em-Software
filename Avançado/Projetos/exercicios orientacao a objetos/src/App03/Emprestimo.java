/* Programa para controlar o  emprestimo de um livro
 * Programador: Alberto Paz
 * Data: 09/12/2019 */

package App03;

public class Emprestimo {
	
	private String emprestimo;
	
	

	public String getEmprestimo() {
		return emprestimo;
	}



	public void setEmprestimo(String emprestimo) {
		this.emprestimo = emprestimo;
	}



	public static void main(String[] args) {
		
		// Criando o objeto Pessoa
		Pessoa p1 = new Pessoa();
		// Colocando valores para os atributos do objeto pelo metodo set
		p1.setNome("Alberto");
		p1.setCpf("123.456.789-0");
		p1.setIdade(24);
		
		Livro l1 = new Livro();
		l1.setEditora("Vozes");
		l1.setNome("A computação Atual");
		l1.setRegistro(123);
		
		Emprestimo e1 = new Emprestimo();
		
		e1.setEmprestimo("Realizante da operação: "+p1.getNome()+" - "+p1.getCpf()+".\nLivro Emprestado: "+l1.getNome()+" - "+l1.getEditora()+" - "+l1.getRegistro());
		
		System.out.println(e1.getEmprestimo());
		

	}

}
