package app02;

public class DVD extends Base{
	
	private float duracao;
	
	public DVD (String nome, float preco, float duracao) {
		super(nome, preco);
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "[duracao=" + duracao + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
}
