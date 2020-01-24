/* Programa para  escreva um trecho Java que exiba os valores de um array a double numa mesma linha.
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

public class App02 {
    public static void main(String[] args) {
    	//criando o vetor
        double vetor[] = {1,2,3,4,5};

        //escrevendo os valores do vetor
        for(int i=0; i<vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
     
    }
}
