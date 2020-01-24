/* Programa para verificar a validade da data de aniversario de uma pessoa
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

package app;
// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App13 {
    public static void main(String[] args) {

        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        Integer dia, mes;
        String nomeMes = "";

        System.out.println("Informe o dia do seu aniversario: ");
        //usando nextInt pois ira receber um valor inteiro
        dia = ler.nextInt();

        System.out.println("informe o mes do seu aniversario: ");
        mes = ler.nextInt();
        
        ler.close();

        //Print so para separar entrada de saida dos dados
        System.out.println("////////////////////////////////////////////////////");

        //Achando o nome correspondente ao numero do mes
        switch (mes) {
            case 1:
                nomeMes = "janeiro";
                break;
            case 2:
                nomeMes = "fevereiro";
                break;
            case 3:
                nomeMes = "março";
                break;
            case 4:
                nomeMes = "abril";
                break;
            case 5:
                nomeMes = "maio";
                break;
            case 6:
                nomeMes = "junho";
                break;
            case 7:
                nomeMes = "julho";
                break;
            case 8:
                nomeMes = "agosto";
                break;
            case 9:
                nomeMes = "setembro";
                break;
            case 10:
                nomeMes = "outubro";
                break;
            case 11:
                nomeMes = "novembro";
                break;
            case 12:
                nomeMes = "dezembro";
                break;
            default:
            System.out.println("Numero de mes informado não é valido");
        }
        
        //verificando o mes
        if (nomeMes == "fevereiro") {
            //verificando dias que o mes contem
            if (dia <= 29 && mes == 2) {
                System.out.println("Data ok!");
                System.out.println("O mes do seu aniversario e: "+nomeMes);
            } else {
                System.out.println("Quantidade de dias invalido para "+nomeMes);
                System.out.println("Dia de mes invalido para "+nomeMes);
            }
        } else {
        if (nomeMes == "abril" || nomeMes == "junho" || nomeMes == "setembro" || nomeMes == "novembro") {
            if (dia <= 30) {
                System.out.println("Data ok!");
                System.out.println("O mes do seu aniversario e: "+nomeMes);
            } else {
                System.out.println("Quantidade de dias invalido para "+nomeMes);
                System.out.println("Dia de mes invalido para "+nomeMes);
            }
        } else {
            if (dia <=31) {
                System.out.println("Data ok!");
                System.out.println("O mes do seu aniversario e: "+nomeMes);
            }
            else {
                System.out.println("Quantidade de dias invalido para "+nomeMes);
                System.out.println("Dia de mes invalido para "+nomeMes);
            }
        }
        }
    
    }

}