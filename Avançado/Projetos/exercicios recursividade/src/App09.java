/* Programa para realizar a conversao de um numero decimal para binario
 * Programador: Alberto Paz
 * Data: 06/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App09 {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um numero");
		int numero = ler.nextInt();
		
		ler.close();
		
		int binario = 1;
		
		System.out.println("O numero "+numero+" em binario �: "+conversao(numero, binario));

	}
	
	// Metodo para converter de decimal para binario
	public static int conversao (int n, int bI) {
		String bS = Integer.toString(bI);
		
		// Caso o numero final seja 1, ele para aqui
		if (n == 1) {
			bS += "1";
			
			// criando uma variavel bSS string builder para poder fazer a revers�o dos numeros
			StringBuilder bSS = new StringBuilder(bS);
			// o reverse() ira fazer a revers�o da String
			bSS.reverse();
			
			// salvando essa revers�o em uma String para retornar ela posteriormente
			String bSSS = bSS.toString();
			
			// Retirando o ultimo elemento dessa String que n�o faz parte do numero;
			bSSS = bSSS.substring(0, bSSS.length()-1);
			
			// convertendo bSSS para integer
			int bSSSI = Integer.parseInt(bSSS);
			
			return bSSSI;
			
		// Se o numero n�o for zero ou 1 ele continua o loop
		} else {
			if (n > 1) {
			int resto = n%2;
			String restoS = Integer.toString(resto);
			String bS2 = restoS;
			//bS = bS.concat(restoS);
			bS = bS + bS2;
			n = n/2;
			bI = Integer.parseInt(bS);
			
			return conversao(n, bI);
		
			// Se o numero for zero ele para o loop
			} else {
				// criando uma variavel bSS string builder para poder fazer a revers�o dos numeros
				StringBuilder bSS = new StringBuilder(bS);
				// o reverse() ira fazer a revers�o da String
				bSS.reverse();
				
				// salvando essa revers�o em uma String para retornar ela posteriormente
				String bSSS = bSS.toString();
				
				// Retirando o ultimo elemento dessa String que n�o faz parte do numero;
				bSSS = bSSS.substring(0, bSSS.length()-1);
				
				return Integer.parseInt(bSSS);
			}
		}
		
		
	}

}
