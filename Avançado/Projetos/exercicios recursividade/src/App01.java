/* Programa para pegar o numero digitado pelo usuari o e mostrar a soma de seus algarismos
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App01 {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um numero: ");
		numero = ler.nextInt();
		
		ler.close();
		
		System.out.println("A somas dos algarismos do seu numero e: "+somaAlg(numero, 0));
	}
	
	public static int somaAlg (int n, int aux) {
		
		if (n < 1) {
			return aux;
		} else {
			aux += n%10;
			return somaAlg(n/10, aux);
		}
		
	}

}
