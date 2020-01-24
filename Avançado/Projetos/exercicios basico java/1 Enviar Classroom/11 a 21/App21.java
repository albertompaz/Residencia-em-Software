/* Programa para desenhar a piramide:
    01
    02 02
    03 03 03
    04 04 04 04
    05 05 05 05 05
    06 06 06 06 06 06
    07 07 07 07 07 07 07
    08 08 08 08 08 08 08 08
    09 09 09 09 09 09 09 09 09
    10 10 10 10 10 10 10 10 10 10
    11 11 11 11 11 11 11 11 11 11 11
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

package app;

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App21 {
    public static void main(String[] args) throws Exception {
        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        int linha = 01, coluna = 01, totalLinhas;

        System.out.println("Determina a quantidade de linhas:");
        //nextInt pois recebera um valor inteiro
        totalLinhas = ler.nextInt();

        ler.close();

        //Loop da piramide com o total de linhas passados
        while (linha <= totalLinhas) {
            //aumentando as colunas da piramide
            while (coluna < linha){    
                System.out.printf(" %02d", coluna);
                coluna = coluna + 01;
            }
            System.out.printf(" %02d\n", coluna);
            //incrementando
            linha = linha + 01;
            coluna = 01;
        }
    }
}