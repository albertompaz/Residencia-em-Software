/* Programa para exibir todos os números pares, impares e primos de 10 a 200.
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

package app;

// biblioteca que usarei uma classe para verificar o numero primo
import java.math.BigInteger;

public class App16 {
    public static void main(String[] args) throws Exception {

        // Iniciando um vetor e passando o tamanho maior que cabera os numeros necessarios
        int pares[] = new int[200];
        //mostrando que tanto faz usar int ou Integer
        Integer impares[] = new Integer[200];
        int primos[] = new int[200];

        //Contadores para as posições do vetor
        Integer contPar=0 , contImpar=0, contPrimos=0;

        //Loop para verificar os numeros pares, impares e primos entre 10 e 200
        for (int i=10; i<=200; i++) {
            //verificando se o numero é par
            if ( (i%2) == 0 ) {
                pares[contPar] = i;
                contPar++;
            }

            //verificando se o numero é impar
            if ( (i%2) == 1 ) {
                impares[contImpar] = i;
                contImpar++;
            }

            //função isProblemPrime de BigInteger que faz a verificação se o numero é primo ou não
            if ( new BigInteger(String.valueOf(i)).isProbablePrime(200) ) {
                primos[contPrimos] = i;
                contPrimos++;
            }
        }

        //Imprimindo os valores correspondentes com seus respectivos loops para isso
        System.out.println("Numeros pares de 10 a 200: ");
        for (int i=0; i<contPar; i++) {
            System.out.print(pares[i]+", ");
        }

        //separar os outputs
        System.out.println("///////////////////////////////////////");

        System.out.println("Numeros impares de 10 a 200: ");
        for (int i=0; i<contImpar; i++) {
            System.out.print(impares[i]+", ");
        }

        System.out.println("///////////////////////////////////////");

        System.out.println("Numeros primos de 10 a 200: ");
        for (int i=0; i<contPrimos; i++) {
            System.out.print(primos[i]+", ");
        }
    }
}