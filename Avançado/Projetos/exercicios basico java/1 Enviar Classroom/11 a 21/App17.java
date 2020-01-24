/* Programa para exibir 50 números sorteados de 1 a 100 para o usuário.
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

package app;

// biblioteca necessaria para o gerador automatico;
import java.util.Random;

public class App17 {
    public static void main(String[] args) throws Exception {
        
        //Instanciando um objeto da classe Ramdom usando o construtor basico
        Random gerador = new Random();

        System.out.println("Os seus 50 numeros aleatorios entre 1 e 100 sao: ");

        for (int i=0; i<50; i++) {
            //gerando um numero aleatorio entre 0 e 100
            System.out.println(gerador.nextInt(101));
        }

    }
}