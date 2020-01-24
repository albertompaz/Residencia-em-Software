package app03;

public class Livro extends Base{
	
	private String autor;

	public Livro(String nome, float preco, int codigoDeBarras, String autor) {
		super(nome, preco, codigoDeBarras);
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
	// Sobreescreendo o metodo toString() para retornar as informações do objeto
	
	
	
}
