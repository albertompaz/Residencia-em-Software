/* Programa para verificar se uma pessoa pode votar ou não
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

package app;
// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App12 {
    public static void main(String[] args) throws Exception {

        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        Integer idade;

        System.out.println("Informe sua idade: ");
        //nextInt pois recebera um valor inteiro
        idade = ler.nextInt();

        ler.close();

        //laço de if para ver em qual situação cairá
        if (idade < 16) {
            System.out.println("Voce nao pode votar");
        } else {
            if ((idade >= 16 && idade < 18) || (idade > 70)) {
                System.out.println("Voto facultativo!");
            } else {
                System.out.println("Voto obrigatorio!");
            }
        }
    }
}