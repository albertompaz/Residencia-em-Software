/* Programa para escrever o vetor: 10 9 8 7 6 5 4 3 2 1 
 * Programador: Alberto Paz
 * Data: 05/12/2019 */


public class App01a {
    public static void main(String[] args) {

        int contador = 0;

        int vetor[] = new int[10];

        System.out.println("Seu vetor e: ");

        //preenchendo e escrevendo o vetor
        for (int i=10; i>=1; i--) {
            vetor[contador] = i;

            System.out.print(vetor[contador]+" ");

            contador++;
        }
    }
}
