package app;
// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App9 {
    public static void main(String[] args) throws Exception {

        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        Integer A, B, C;

        System.out.println("Informe o valor de A: ");
        A = ler.nextInt();

        System.out.println("Informe o valor de B ");
        B = ler.nextInt();

        C = A;
        A = B;
        B = C;

        //Fazendo dois prints pois o valor de B está saindo duplicado
        System.out.print("Agora o valor de A e: "+A+". E o valor de B e: ");
        System.out.println(B);
    }
}