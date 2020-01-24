/* Programa para calcular a sequencia de Fibonacci por recursividade
 * Programador: Alberto Paz
 * Data: 06/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App10 {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
		Scanner ler = new Scanner(System.in);
		
		int numero1 = 1;
		int numero2 = 2;
		
		System.out.println("Informe o valor final da sequencia de Fibonnaci");
		// nextInt pois ira receber um valor inteiro
		int valorF = ler.nextInt();
		
		ler.close();
		
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(sequencia(numero1, numero2, valorF));

	}
	
	// Metodo para calcular a sequencia de Fibonacci
	public static int sequencia (int n1, int n2, int vf) {
		// Condição de parada do loop, se o numero for maior que o valor final
		if (n2 > vf) {
			return n1;
		// Se for menor, continua escrevendo e chamando o proprio metodo
		} else {
			int n3 = n1+n2;
			// if para escrever o numero, e não escrever o proximo caso esse valor passe do valor final
			if (n3 < vf) {
				System.out.println(n3);
			}
			return sequencia(n2, n3, vf);
		}
		
	}

}
