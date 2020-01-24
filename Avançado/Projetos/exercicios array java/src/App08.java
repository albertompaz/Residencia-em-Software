/* Programa para criar um m�todo que devolve um array de n�meros lidos do teclado.
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;
//Importando o pacote ArrayList para criara vetores que n�o precisam de dimens�es
import java.util.ArrayList;

public class App08 {

	public static void main(String[] args) {

		System.out.println("A sua lista �: " + ler());

	}

	public static ArrayList<Float> ler() {

		// Instanciando e criando um objeto Scanner:
		Scanner ler = new Scanner(System.in);

		// criando o ArrayList 'vetor' que � um vetor que n�o precisa de dimens�o
		ArrayList<Float> vetor = new ArrayList<Float>();

		char ficar = 's';
		// preenchendo o vetor com o loop
		while (ficar == 's') {
			System.out.println("Informe um numero para a lista");
			// adicionando numero informado ao vetor. Float pois n�o � informado se ser� s�
			// numero inteiros
			vetor.add(ler.nextFloat());

			System.out.println("Quer informar um numero pra lista? s-sim, n-nao");
			// fazendo o scaner entender o next(), que � string, como char
			ficar = ler.next().charAt(0);
		}
		
		ler.close();

		return vetor;
	}
}
