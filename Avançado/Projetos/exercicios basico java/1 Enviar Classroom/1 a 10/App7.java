package app;
// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App7 {
    public static void main(String[] args) throws Exception {

        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        float R, A;
        // V como double pois o java da erro se for como float
        double V;

        System.out.println("Informe o raio da lata: ");
        R = ler.nextFloat();

        System.out.println("Informe o altura da lata: ");
        A = ler.nextFloat();

        V = 3.14159*R*R*A;

        System.out.println("O volume da lata é de: " + V);
        
    }
}