/* Programa para determinar a quantidade de homens e mulheres (separadamente) que são maiores
de idade, baseado numa lista de 10 pessoas.
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

package app;

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App19 {
    public static void main(String[] args) throws Exception {

        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        String sexo;
        int idade, contadorL, contadorH, contadorM;

        //Contador L sera o contador geral das pessoas, o H para homens e M para mulheres
        contadorL = 0;
        contadorH = 0;
        contadorM = 0;

        //Começando o loop das pessoas
        while(contadorL<=10) {

            System.out.println("Informe seu sexo: homem, mulher");
            sexo = ler.next();

            System.out.println("Informe sua idade: ");
            idade = ler.nextInt();

            //Incrementando os contadores
            if (idade >= 18) {
                if (sexo == "homem") {
                    contadorH = contadorH + 1;
                } else {
                    contadorM = contadorM + 1;
                }
            }
            
            contadorL++;
        }

        ler.close();

        System.out.println("A quantidade de Homens e: "+contadorH);
        System.out.println("A quantiadde de Mulheres e: "+contadorM);

    }
}