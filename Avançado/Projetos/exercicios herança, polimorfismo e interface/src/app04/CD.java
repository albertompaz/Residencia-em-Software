package app04;

public class CD extends Base implements Comparable{
	
	private int numeroDeFaixas;
	
	public CD (String nome, float preco, int codigoDeBarras, int numeroDeFaixas) {
		super(nome, preco, codigoDeBarras);
		this.numeroDeFaixas = numeroDeFaixas;
	} 
	
	// Sobreescreendo o metodo toString() para retornar as informações do objeto
	public String toString() {
		return "[numeroDeFaixas=" + numeroDeFaixas + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
	// implementando a interface
	public String comparacaoPorNome(String nome, String nome2) {
		if (nome == nome2) {
			return "Os nomes são iguais";
		} else {
			return "Os nomes são diferentes";
		}
	}
	
}
