/* Programa para criar um método que recebe um array de inteiros e retorna a quantidade de elementos do array que são números negativos.
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App04 {
    public static void main(String[] args) {
        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[50];
        int contVetor = 0;
        char ficar = 's';

        //preenchendo o vetor com o loop
        while (ficar == 's') {
            System.out.println("Informe um numero negativo ou positivo para a lista");
            //indicando qual posição do vetor
            vetor[contVetor] = ler.nextInt();

            System.out.println("Quer informar um numero pra lista? s-sim, n-nao");
            //fazendo o scaner entender o next() que é string como char
            ficar = ler.next().charAt(0);

            contVetor++;
        }
        
        ler.close();
        
        //chamando o metodo para dar a resposta
        System.out.println("A quantidade de elementos negativos do vetor e: "+negativo(vetor, contVetor));
    }
    //criando o metodo
    private static int negativo (int[] v, int c) {
        int contador = 0;
        //loop para verificar os numeros negativos
        for(int i=0; i<=c; i++) {
            if (v[i] < 0) {
                contador++;
            }
        }
        return contador;
    }
}
