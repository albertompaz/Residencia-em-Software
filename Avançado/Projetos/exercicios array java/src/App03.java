/* Programa para escrever um trecho Java que leia 10 valores double do teclado e armazene-os num array.
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App03 {
    public static void main(String[] args) {
        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        double vetor[] = new double[10];

        //for para gravar os dados no vetor
        for(int i=0; i<=9; i++) {
            System.out.println("Informe um valor");
            //nextDouble pois o vetor é do tipo double
            vetor[i] = ler.nextDouble();
        }
        
        ler.close();

        System.out.println("Seu vetor e: ");
        //for para imprimir os dados do vetor
        for (int i=0; i<vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
    }
}