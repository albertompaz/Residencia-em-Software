/* Programa para exibir os 50 primeiros números da seqüência de Fibonacci
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

package app;

public class App20 {
    public static void main(String[] args) throws Exception {
        //Long pois podera ser um numero grande
        long primeiro, segundo, terceiro;

        primeiro = 1;
        segundo = 1;
        terceiro = 2;

        System.out.println("Os 50 primeiros numeros da sequencia de Fibonacci sao: ");
        System.out.println(primeiro);
        System.out.println(segundo);

        //fazendo o loop para mostrar os proximos numeros
        for (int i=2; i<51; i++) {
            
            primeiro = segundo;
            segundo = terceiro;

            terceiro = primeiro + segundo;
            System.out.println(terceiro);
        }
    }
}