package app;
// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        
        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        double valor;
        double real;

        System.out.println("Informe o valor em Dollar: ");
        valor = ler.nextDouble();

        real = valor * 2.5;

        System.out.println("O valor informado em reais é igual a: " + real);

    }
}