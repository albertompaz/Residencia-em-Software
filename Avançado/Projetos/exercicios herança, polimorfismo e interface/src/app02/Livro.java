package app02;

public class Livro extends Base{
	
	private String autor;

	public Livro(String nome, float preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
	// Sobreescreendo o metodo toString() para retornar as informações do objeto
	
	
	
}
