/* Programa para realizar uma função recursiva para elevar um valor base a potência do valor expoente.
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App02 {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
		Scanner ler = new Scanner(System.in);
		
		int base, expoente;
		
		System.out.println("Informe o numero base: ");
		// nextInt pois a variavel recebera valores inteiros
		base = ler.nextInt();
		
		System.out.println("Informe o expoente");
		expoente = ler.nextInt();
		
		ler.close();
		
		// Metodo pot que ira realizar o calculo da potenciacao
		System.out.println("O resultado é: "+ pot(base, expoente));

	}
	
	public static int pot (int b, int e) {
		
		// Calculo da potenciacao com recursividade
		if (e == 0) {
			return 1;
		} else {
			return (b*pot(b, e-1));
		}
		
	}

}
