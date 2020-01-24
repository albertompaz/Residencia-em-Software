/* Programa para criar um método que recebe um array de inteiros positivos e substitui seus elementos de valor ímpar por -1 e os pares por +1.
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;
//Importando o pacote ArrayList para criara vetores que não precisam de dimensões
import java.util.ArrayList;

public class App09 {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
		Scanner ler = new Scanner(System.in);

		// criando o ArrayList 'vetor' que é um vetor que não precisa de dimensão
		ArrayList<Integer> vetor = new ArrayList<Integer>();

		char ficar = 's';
		// preenchendo o vetor com o loop
		while (ficar == 's') {
			System.out.println("Informe um numero para a lista");
			// adicionando numero informado ao vetor. Float pois não é informado se será só
			// numero inteiros
			vetor.add(ler.nextInt());

			System.out.println("Quer informar um numero pra lista? s-sim, n-nao");
			// fazendo o scaner entender o next(), que é string, como char
			ficar = ler.next().charAt(0);
		}
		
		ler.close();
		
		System.out.println("O seu vetor original é: "+vetor);
		System.out.println("O seu vetor convertido em 1 para valores pares e -1 para valores impares é: \n"+parImpar(vetor));
	}
	
	public static ArrayList<Integer> parImpar (ArrayList<Integer> v) {
		//criando novo vetor que ira receber os valors -1 para impar e q para par
		ArrayList<Integer> vetorCorrigido = new ArrayList<Integer>();
		
		//loop para verificar cada elemento
		for (int element: v) {
			//verificando se o elemento é par
			if ((element%2)==0) {
				vetorCorrigido.add(1);
			} else {
				vetorCorrigido.add(-1);
			}
		}
		return vetorCorrigido;
	}

}
