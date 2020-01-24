package app04;

public class Livro extends Base implements Comparable{
	
	private String autor;

	public Livro(String nome, float preco, int codigoDeBarras, String autor) {
		super(nome, preco, codigoDeBarras);
		this.autor = autor;
	}

	// Sobreescreendo o metodo toString() para retornar as informações do objeto
	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", nome=" + nome + ", preco=" + preco + "]";
	}

	@Override
	public String comparacaoPorNome(String nome, String nome2) {
		if (nome == nome2) {
			return "Os nomes são iguais";
		} else {
			return "Os nomes são diferentes";
		}
	}
	
}
