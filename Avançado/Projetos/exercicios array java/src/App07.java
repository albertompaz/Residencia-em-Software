/* Programa para criar um método que recebe um array de números e devolve a posição onde se encontra o maior valor do array. Se houver mais de um valor
 * maior, devolver a posição da primeira ocorrência.
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;
//Importando o pacote ArrayList para criara vetores que não precisam de dimensões
import java.util.ArrayList;


public class App07 {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
		Scanner ler = new Scanner(System.in);

		// criando o ArrayList 'vetor' que é um vetor que não precisa de dimensão
		ArrayList<Float> vetor = new ArrayList<Float>();
		
		char ficar = 's';
		// preenchendo o vetor com o loop
		while (ficar == 's') {
			System.out.println("Informe um numero para a lista");
			// adicionando numero informado ao vetor. Float pois não é informado se será só numero inteiros
			vetor.add(ler.nextFloat());

			System.out.println("Quer informar um numero pra lista? s-sim, n-nao");
			// fazendo o scaner entender o next(), que é string, como char
			ficar = ler.next().charAt(0);
		}
		
		ler.close();
		
		System.out.println("A sua lista é: ");
		//forEach para escrever os dados do vetor
		for (float element: vetor) {
			System.out.print(element+" ");
		}
		
		System.out.println("\nA posição do elemento da sua lista de maior valor é: "+maior(vetor));
	}
	
	public static float maior (ArrayList<Float> v) {
		float maiorValor = -9999999;
		//Variavel para controlar a posição
		int posicao = 0;
		int posicaoMaior = 0;
		
		//forEach para fazer a verificação do maior elemento
		for (float element: v) {
			// Comparação entre o valor atual e o maior valor
			if (element > maiorValor) {
				maiorValor = element;
				posicaoMaior = posicao;
			}
			posicao++;
		}
		return (posicaoMaior+1);
	}

}
