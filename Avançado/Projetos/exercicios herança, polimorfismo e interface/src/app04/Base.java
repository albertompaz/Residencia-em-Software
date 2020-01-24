package app04;

public abstract class Base {
	
	protected String nome;
	protected float preco;
	protected int codigoDeBarras;
	
	public Base (String nome, float preco, int codigoDeBarras){
		this.nome = nome;
		this.preco = preco;
		this.codigoDeBarras = codigoDeBarras;
	}

	// sobreescrevendo o metodo .equals() para comparar se sao objetos iguais pelo codigo de barras
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Base other = (Base) obj;
		if (codigoDeBarras != other.codigoDeBarras)
			return false;
		return true;
	}
	
}
