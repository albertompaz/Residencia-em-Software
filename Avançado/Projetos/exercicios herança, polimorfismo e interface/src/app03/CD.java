package app03;

public class CD extends Base {
	
	private int numeroDeFaixas;
	
	public CD (String nome, float preco, int codigoDeBarras, int numeroDeFaixas) {
		super(nome, preco, codigoDeBarras);
		this.numeroDeFaixas = numeroDeFaixas;
	} 
	
	// Sobreescreendo o metodo toString() para retornar as informações do objeto
	public String toString() {
		return "[numeroDeFaixas=" + numeroDeFaixas + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
}
