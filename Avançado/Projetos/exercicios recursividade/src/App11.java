/* Programa para calcular o fatorial de algum numero
 * Programador: Alberto Paz
 * Data: 06/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App11 {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o numero para calcular o fatorial: ");
		// nextInt pois ira receber um valor inteiro
		int numero = ler.nextInt();
		
		ler.close();
		
		System.out.println("O fatorial de "+numero+" e: "+fatorial(numero));
		
	}
	
	// metodo para calcular o fatorial
	public static int fatorial (int n) {
		// se indicar o numero zero, ira retornar 1
		if (n<=0) {
			return 1;
		// se não for zero, ira calculando a multiplicação até chegar a zero
		} else {
			return n * fatorial(n-1);
		}
	}

}
