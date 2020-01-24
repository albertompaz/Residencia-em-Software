package app;

// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {

        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;

        System.out.println("Informe a nota do primeiro bimestre: ");
        nota1 = ler.nextFloat();

        System.out.println("Informe a nota do segundo bimestre: ");
        nota2 = ler.nextFloat();

        System.out.println("Informe a nota do terceiro bimestre: ");
        nota3 = ler.nextFloat();

        System.out.println("Informe a nota do quarto bimestre: ");
        nota4 = ler.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média final é de: " + media);
    }
}