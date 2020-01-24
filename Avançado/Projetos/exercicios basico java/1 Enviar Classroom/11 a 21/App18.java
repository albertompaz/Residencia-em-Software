/* Programa para Criar um jogo para o usuário descobrir um número sorteado de 1 a 100. A cadatentativa dele, 
forneça uma dica mostrando se o número é maior ou menor.Quando ele descobrir exiba uma mensagem de parabéns e 
mostre em quantas tentativas ele conseguiu.
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

package app;

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;
// biblioteca necessaria para o gerador automatico;
import java.util.Random;

public class App18 {
    public static void main(String[] args) throws Exception {

        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        //Instanciando um objeto da classe Ramdom usando o construtor basico
        Random gerador = new Random();

        int numeroAleatorio, contador, tentativa;

        //variavel que ira controlar o loop de perguntas
        boolean acertou = false;

        //variavel que ira controlar a quantidade de tentativas
        contador = 1;

        //gerando um numero aleatorio entre 0 e 100
        numeroAleatorio = gerador.nextInt(101);
        //System.out.println(numeroAleatorio);

        //começando o loop de perguntas
        while (acertou == false) {

            System.out.println("Informe o numero: ");
            tentativa = ler.nextInt();

            //verificando se o usuario acertou
            if (tentativa == numeroAleatorio) {
                System.out.println("Parabens, voce certou!");
                System.out.println("Sua quantidade de tentativas foi: "+contador);
                acertou = true;
                //verificando se o usuario errou
            } else {
                if (tentativa > numeroAleatorio) {
                    System.out.println("O numero é menor");
                } else {
                    System.out.println("O numero é maior");
                }
            }

            System.out.println("///////////////////////////////////////////////////");
            //Aumentando a quantidade de tentativas
            contador++;
        }

        

    }
}