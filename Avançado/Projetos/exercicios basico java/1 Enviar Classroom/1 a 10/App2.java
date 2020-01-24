package app;
// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        // Criando variaveis para receber os dados do usuário
        float peso;
        float altura;

        float IMC;

        System.out.println("Informe seu peso: ");
        peso = ler.nextFloat();

        System.out.println("Informe sua altura: ");
        altura = ler.nextFloat();

        //Realizando calculo do IMC
        IMC = peso / (altura*altura);

        System.out.println("Seu IMC é de " + IMC);
    }
}