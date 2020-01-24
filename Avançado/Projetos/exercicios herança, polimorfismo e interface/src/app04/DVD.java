package app04;

public class DVD extends Base implements Comparable{
	
	private float duracao;
	
	public DVD (String nome, float preco, int codigoDeBarras, float duracao) {
		super(nome, preco, codigoDeBarras);
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "[duracao=" + duracao + ", nome=" + nome + ", preco=" + preco + "]";
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
