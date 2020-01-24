/* Programa para receber um valor e realizar a contagem regressiva dele até zero
 * Programador: Alberto Paz
 * Data: 06/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App05 {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe um numero: ");		
		// nextInt pois ira receber um numero inteiro
		int numero = ler.nextInt();
		
		ler.close();
		
		System.out.println(voltar(numero));
				
	}
	// metodo para escrever os numeros pela recursividade
	public static int voltar (int n) {
		// se for igual a zero, para a recursividade
		if (n == 0) {
			return n;
		//se for diferente de zero, vai diminuindo em 1 o numero e chamando o metodo denovo
		} else {
			System.out.print(n+" ");
			return voltar(n-1);
		}
		
	}

}
