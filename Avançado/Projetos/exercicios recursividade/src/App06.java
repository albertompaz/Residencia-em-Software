/* Programa para receber um valor e realizar a contagem regressiva dele at� zero
 * Programador: Alberto Paz
 * Data: 06/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;
//Importando o pacote ArrayList para criara vetores que n�o precisam de dimens�es
import java.util.ArrayList;

public class App06 {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
		Scanner ler = new Scanner(System.in);
		
		// criando o ArrayList 'vetor' que � um vetor que n�o precisa de dimens�o
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		
		char ficar = 's';
		// preenchendo o vetor com o loop
		while (ficar == 's') {
			System.out.println("Informe um numero para a lista");
			// adicionando numero informado ao vetor. Float pois n�o � informado se ser� s�
			// numero inteiros
			vetor.add(ler.nextInt());

			System.out.println("Quer informar um numero pra lista? s-sim, n-nao");
			// fazendo o scaner entender o next(), que � string, como char
			ficar = ler.next().charAt(0);
		}
		
		ler.close();
		
		int soma = 0;
		
		System.out.println("A somo dos elementos da lista �: "+soma(vetor, (vetor.size()-1), soma));

	}
	// M�todo aonde ira utilizar a recursividade para calcular a soma dos elementos da lista
	public static int soma (ArrayList<Integer> v, int q, int s) {
		// verificando se � o ultimo elemento da lista, se for ele somara e ira parar
		if (q == 0) {
			s += v.get(q);
			return (s);
		//Se n�o for o ultimo elemento da lista, ele ira somar e chamar o m�todo denovo.
		} else {
			s += v.get(q);
			return soma (v, q-1, s);
		}
		
	}

}
