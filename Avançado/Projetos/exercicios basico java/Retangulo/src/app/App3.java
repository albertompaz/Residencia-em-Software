package app;

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {

        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        float comprimento, largura, perimetro, area;

        System.out.println("Informe o comprimento do retangulo: ");
        comprimento = ler.nextFloat();

        System.out.println("Informe a largura do retangulo: ");
        largura = ler.nextFloat();

        // Realizando os calculos que o exercicio pede
        perimetro = (2 * comprimento) + (2 * largura);
        area = comprimento * largura;

        System.out.println("O perimetro do retangulo é de " + perimetro);
        System.out.println("A area do retangulo é de " + area);
        
    }
}