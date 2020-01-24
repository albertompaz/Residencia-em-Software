/* Programa para determinar o signo e se a data é valida de uma pessoa
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

package app;
// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App14 {
    public static void main(String[] args) throws Exception {

        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        Integer dia, mes;
        String nomeMes = "";

        System.out.println("Informe o dia do seu aniversario: ");
        //.nextInt pois recebra um valor inteiro
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
    
        //Iniciando a verificação dos signos
        if ( (dia >= 21 && mes == 3) || (dia <= 19 && mes == 4) ) {
            System.out.println("Seu signo é Áries.");
        } 
        if ( (dia >= 20 && mes == 4) || (dia <= 20 && mes == 5) ) {
            System.out.println("Seu signo é Touro.");
        } 
        if ( (dia >= 21 && mes == 5) || (dia <= 21 && mes == 6) ) {
            System.out.println("Seu signo é Gêmeos.");
        } 
        if ( (dia >= 22 && mes == 6) || (dia <= 22 && mes == 7) ) {
            System.out.println("Seu signo é Câncer.");
        } 
        if ( (dia >= 23 && mes == 7) || (dia <= 22 && mes == 8) ) {
            System.out.println("Seu signo é Leão.");
        } 
        if ( (dia >= 23 && mes == 8) || (dia <= 22 && mes == 9) ) {
            System.out.println("Seu signo é Virgem.");
        } 
        if ( (dia >= 23 && mes == 9) || (dia <= 22 && mes == 10) ) {
            System.out.println("Seu signo é libra.");
        } 
        if ( (dia >= 23 && mes == 10) || (dia <= 21 && mes == 11) ) {
            System.out.println("Seu signo é Escorpião.");
        } 
        if ( (dia >= 22 && mes == 11) || (dia <= 21 && mes == 12) ) {
            System.out.println("Seu signo é Sagitário.");
        } 
        if ( (dia >= 22 && mes == 12) || (dia <= 19 && mes == 1) ) {
            System.out.println("Seu signo é Capricórnio.");
        } 
        if ( (dia >= 22 && mes == 1) || (dia <= 18 && mes == 2) ) {
            System.out.println("Seu signo é Aquário.");
        } 
        if ( (dia >= 19 && mes == 2) || (dia <= 20 && mes == 3) ) {
            System.out.println("Seu signo é Peixes.");
        } 

    }

}