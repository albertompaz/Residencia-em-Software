/* Programa para criar um m�todo que recebe um array de n�meros e devolve a posi��o onde se encontra o maior valor do array. Se houver mais de um valor
 * maior, devolver a posi��o da primeira ocorr�ncia.
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;
//Importando o pacote ArrayList para criara vetores que n�o precisam de dimens�es
import java.util.ArrayList;


public class App07 {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
		Scanner ler = new Scanner(System.in);

		// criando o ArrayList 'vetor' que � um vetor que n�o precisa de dimens�o
		ArrayList<Float> vetor = new ArrayList<Float>();
		
		char ficar = 's';
		// preenchendo o vetor com o loop
		while (ficar == 's') {
			System.out.println("Informe um numero para a lista");
			// adicionando numero informado ao vetor. Float pois n�o � informado se ser� s� numero inteiros
			vetor.add(ler.nextFloat());

			System.out.println("Quer informar um numero pra lista? s-sim, n-nao");
			// fazendo o scaner entender o next(), que � string, como char
			ficar = ler.next().charAt(0);
		}
		
		ler.close();
		
		System.out.println("A sua lista �: ");
		//forEach para escrever os dados do vetor
		for (float element: vetor) {
			System.out.print(element+" ");
		}
		
		System.out.println("\nA posi��o do elemento da sua lista de maior valor �: "+maior(vetor));
	}
	
	public static float maior (ArrayList<Float> v) {
		float maiorValor = -9999999;
		//Variavel para controlar a posi��o
		int posicao = 0;
		int posicaoMaior = 0;
		
		//forEach para fazer a verifica��o do maior elemento
		for (float element: v) {
			// Compara��o entre o valor atual e o maior valor
			if (element > maiorValor) {
				maiorValor = element;
				posicaoMaior = posicao;
			}
			posicao++;
		}
		return (posicaoMaior+1);
	}

}
