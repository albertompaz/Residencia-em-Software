/* Programa para "controlar" um carro, suas troca de marcha, consumo, etc
 * Programador: Alberto Paz
 * Data: 09/12/2019 */

package App04;

public class Carro {

	private String modelo;
	private String cor;
	private int ano;
	private String Marca;
	private String chassi;
	private String proprietario;
	private int velocidadeMaxima;
	private int velocidadeAtual;
	private int numeroDePortas;
	private boolean tetoSolar;
	private int numeroDeMarchas;
	private boolean cambioAutomatico;
	private int volumeDeCombustivel;
	private int marchaAtual;
	
	public void acelerar() {
		this.velocidadeAtual += 1;
	}
	
	public void freiar() {
		this.velocidadeAtual = 0;
	}
	
	public void trocarMarcha() {
		this.marchaAtual += 1;
	}
	
	public void reduzirMarcha() {
		// verificando qual marcha o carro ta para dar a re
		if ( (this.marchaAtual > 0) && (this.velocidadeAtual > 0) ) {
			this.marchaAtual -= 1;	
		}
		
		
		// Ele só pode dar a Ré se o carro estiver parado
		if ( (this.marchaAtual == 0) && (this.velocidadeAtual) == 0 ) {
			this.marchaAtual -= 1;
		} else {
			System.out.println("Voce não pode engatar a Ré com o carro andando");
		}
		
	}
	
	// Método para calcular a autonomia do carro, pegando o consumo pelo parametro
	
	public Double autonomiaTotal (double autonomia) {
		
		// A autonomia do carro se da pela autonomia passada * quantidade de litros que ele suporta
		double autonomiaCarro = autonomia * this.getVolumeDeCombustivel();
		
		return autonomiaCarro;
	}
	
	// Gerando get e set dos atributos
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	public boolean isTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	public int getNumeroDeMarchas() {
		return numeroDeMarchas;
	}

	public void setNumeroDeMarchas(int numeroDeMarchas) {
		this.numeroDeMarchas = numeroDeMarchas;
	}

	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	public int getVolumeDeCombustivel() {
		return volumeDeCombustivel;
	}

	public void setVolumeDeCombustivel(int volumeDeCombustivel) {
		this.volumeDeCombustivel = volumeDeCombustivel;
	}

	public int getMarchaAtual() {
		return marchaAtual;
	}

	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}
	
}
