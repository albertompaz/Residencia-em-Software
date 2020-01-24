/* Programa para encontrar o maximo divisor comum (MDC) por Euclides
 * Programador: Alberto Paz
 * Data: 06/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App04 {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, divisorInicial;
		
		divisorInicial = 10000;
		
		System.out.println("Informe o primeiro numero: ");
		// nextInt pois a variavel recebera valores inteiros
		numero1 = ler.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		numero2 = ler.nextInt();
		
		ler.close();
		
		System.out.println("O MDC entre "+numero1+" e "+numero2+" e: "+mdc(numero1, numero2, divisorInicial));

	}
	// Metodo para achar o MDC
	// Ele ira diminuindo o divisorInicial at� achar um numero aonde o resto da divis�o dos 2 numeros � igual a zero
	public static int mdc (int n1, int n2, int di) {
		if ( (n1%di == 0) && (n2%di == 0) ) {
			return di;
		} else {
			return mdc(n1, n2, di-1);
		}

	}

}