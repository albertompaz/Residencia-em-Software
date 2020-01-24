package app03;

public class DVD extends Base{
	
	private float duracao;
	
	public DVD (String nome, float preco, int codigoDeBarras, float duracao) {
		super(nome, preco, codigoDeBarras);
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "[duracao=" + duracao + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
	
	
}
