/* Programa para escrever o vetor: 0 1 4 9 16 25 36 49 64 81 100
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

public class App01b {
    public static void main(String[] args) {

        int  contador=1, valorInicial=0;

        int vetor[] = new int[11];

        //loop para criar o vetor e imprimir
        for (int i=0; i<=10; i++) {
            vetor[i] = valorInicial; 
            // conta para fazer o vetor igual ao pedido no enunciado
            valorInicial += contador;

            //contador sempre vai aumentando de 2 em 2
            contador += 2;

            System.out.print(vetor[i]+" ");
        }
    }
}
