/* Programa para realizar a multiplicação sem usar *
 * Programador: Alberto Paz
 * Data: 06/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App07 {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe um numero: ");
		// nextInt poisira receber um valor intero
		int numero1 = ler.nextInt();
		
		System.out.println("Informe outro numero: ");
		int numero2 = ler.nextInt();
		
		ler.close();
		
		int soma = 0;
		
		System.out.println("A multiplicação entre "+numero1+" e "+numero2+" e: "+multiplicacao(numero1, numero2, soma));
				
	}

	public static int multiplicacao (int n1, int n2, int s) {
		if (n2==0) {
			return s;
		} else {
			s += n1;
			return multiplicacao(n1, (n2-1), s);
		}
		
	}
	
}
