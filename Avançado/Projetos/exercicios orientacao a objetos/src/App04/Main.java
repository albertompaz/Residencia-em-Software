/* Programa para "controlar" um carro, suas troca de marcha, consumo, etc
 * Programador: Alberto Paz
 * Data: 09/12/2019 */

package App04;

public class Main {

	public static void main(String[] args) {
		
		// criando objeto Marca
		Marca m1 = new Marca();
		// definindo os atributos de Marca
		m1.setNome("Ford");
		m1.setAnoDeLancamento(1960);
		m1.setNrDeModelos(18);
		m1.setCodigoIdentificadr(1);
		
		// criando o objeto proprietario
		Proprietario p1 = new Proprietario();
		// defenindo os atributos de proprietario
		p1.setNome("Alberto");
		p1.setRg("26.059.784-2");
		p1.setDataDeNascimento("24/01/1995");
		p1.setBairro("Valparaiso");
		p1.setCep("25654-099");
		p1.setCidade("Petropolis");
		p1.setComplemento("Numero 333");
		p1.setEstado("Rio de Janeiro");
		p1.setRua("Rua Rockefeler");
		
		// criando o objeto Carro
		Carro c1 = new Carro();
		// definindo os atributos de carro
		// convertendo de inteiro para string
		c1.setModelo(Integer.toString(m1.getCodigoIdentificadr()));
		c1.setCor("Blue");
		c1.setAno(2016);
		c1.setMarca(m1.getNome());
		c1.setChassi("23ab51a");
		c1.setProprietario(p1.getNome());
		c1.setVelocidadeMaxima(180);
		c1.setVelocidadeAtual(0);
		c1.setNumeroDePortas(4);
		c1.setTetoSolar(true);
		c1.setNumeroDeMarchas(6);
		c1.setCambioAutomatico(true);
		c1.setVolumeDeCombustivel(60);
		c1.setMarchaAtual(0);
		

		System.out.println(c1);
	}

}
