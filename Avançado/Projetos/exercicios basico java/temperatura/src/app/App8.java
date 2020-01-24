package app;
// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App8 {
    public static void main(String[] args) throws Exception {

        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        float fahrenheit, celsius;

        System.out.println("Informe a temperatura em Fahrenheit: ");
        fahrenheit = ler.nextFloat();

        celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.println("A temperatura em Celsius é de: " + celsius);
    }
}