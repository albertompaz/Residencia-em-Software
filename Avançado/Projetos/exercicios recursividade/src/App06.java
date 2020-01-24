/* Programa para receber um valor e realizar a contagem regressiva dele até zero
 * Programador: Alberto Paz
 * Data: 06/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;
//Importando o pacote ArrayList para criara vetores que não precisam de dimensões
import java.util.ArrayList;

public class App06 {

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
		
		int soma = 0;
		
		System.out.println("A somo dos elementos da lista é: "+soma(vetor, (vetor.size()-1), soma));

	}
	// Método aonde ira utilizar a recursividade para calcular a soma dos elementos da lista
	public static int soma (ArrayList<Integer> v, int q, int s) {
		// verificando se é o ultimo elemento da lista, se for ele somara e ira parar
		if (q == 0) {
			s += v.get(q);
			return (s);
		//Se não for o ultimo elemento da lista, ele ira somar e chamar o método denovo.
		} else {
			s += v.get(q);
			return soma (v, q-1, s);
		}
		
	}

}
