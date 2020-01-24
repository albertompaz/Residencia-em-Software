/* Programa para realizar a soma entre um intervalo
 * Programador: Alberto Paz
 * Data: 06/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App08 {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o inicio do intervalo: ");
		// nextInt pois recebera numeros inteiros
		int inicio = ler.nextInt();
		
		System.out.println("Informe o final do intervalo: ");
		int fim = ler.nextInt();
		
		System.out.println("Informe o intervalo da soma: ");
		int intervalo = ler.nextInt();
		
		ler.close();
		
		int soma = 0;
		
		System.out.println("A soma da sua sequencia ("+inicio+"-"+fim+") com intervalo "+intervalo+" e: "+serie(inicio, fim, intervalo, soma));

	}

	// Metodo para realizar a soma da sequencia com com o intervalo passado
	public static int serie (int i, int f, int k, int s) {
		// Se o inicio ficar maior que o fim, para e retorna a soma
		if(i > f) {
			return s;
		// Se não ficar maior, vai somando os numeros até ultrapassar o fim da sequencia.
		} else {
			s += i;
			return ( serie(i+k, f, k, s) );
		}

	}
	
}
