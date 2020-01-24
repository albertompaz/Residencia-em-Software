/* Programa para escrever o vetor: 1 2 3 4 5 10 20 30 40 50
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

//Importando o pacote ArrayList para criara vetores que não precisam de dimensões
import java.util.ArrayList;

public class App01c {

	public static void main(String[] args) {
		// criando o ArrayList 'vetor' que é um vetor que não precisa de dimensão
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		
		//variavel de controle
		int i=1;
		//Loop que ira preencher o vetor
		while (i!=60) {
			if (i < 5) {
				vetor.add(i);
				i++;
			}
			if (i == 5) {
				vetor.add(i);
				i = 10;
			}
			if (i > 5) {
				vetor.add(i);
				i+=10;
			}
		}
		System.out.println(vetor);
	}
}
