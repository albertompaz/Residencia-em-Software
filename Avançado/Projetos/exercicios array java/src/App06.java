/* Programa para criar um método que recebe um array de inteiros a e devolve um array de boolean onde, cada posição indique true 
 * se o elemento da posição correspondente de a é positivo e false caso seja negativo ou zero..
 * Programador: Alberto Paz
 * Data: 05/12/2019 */


//Importando o pacote ArrayList para criara vetores que não precisam de dimensões
import java.util.ArrayList;

//Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App06 {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
		Scanner ler = new Scanner(System.in);

		// criando o ArrayList 'vetor' que é um vetor que não precisa de dimensão
		ArrayList<Integer> vetor = new ArrayList<Integer>();

		char ficar = 's';
		// preenchendo o vetor com o loop
		while (ficar == 's') {
			System.out.println("Informe um numero negativo ou positivo para a lista");
			// adicionando numero informado ao vetor
			vetor.add(ler.nextInt());

			System.out.println("Quer informar um numero pra lista? s-sim, n-nao");
			// fazendo o scaner entender o next(), que é string, como char
			ficar = ler.next().charAt(0);
		}
		
		ler.close();

		System.out.println("O seu vetor original é: ");
		// forEach para mostrar o vetor original
		for (int element : vetor) {
			System.out.print(element + " ");
		}

		System.out.println("\nO seu vetor convertido para true (nº positivos) ou false para (nº negativos/zero) é: ");

		//forEach para informar true (nº positivos) ou false para (nº negativos/zero)
		for (int element : vetor) {
			if (conversao(element) == 1) {
				System.out.print("true ");
			} else {
				System.out.print("false ");
			}
		}

	}

	public static int conversao(int e) {
		int x;

		if (e > 0) {
			x = 1;
			return x;
		} else {
			x = 0;
			return x;
		}

	}

}
