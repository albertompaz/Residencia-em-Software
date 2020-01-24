/* Programa para escrever o vetor: 3 4 7 12 19 28 39 52 67 84
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

//Importando o pacote ArrayList para criara vetores que n�o precisam de dimens�es
import java.util.ArrayList;

public class App01d {

	public static void main(String[] args) {
		
		int valorInicial = 3, incremento=1;
		
		// criando o ArrayList 'vetor' que � um vetor que n�o precisa de dimens�o, Tipo inteiro pois n�o usara valores com casas decimais
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		
		// Loop que ira criar o vetor
		while (valorInicial <= 84) {
			
			vetor.add(valorInicial);
			valorInicial += incremento;
			incremento += 2;
			
		}
		System.out.println(vetor);
	}

}
