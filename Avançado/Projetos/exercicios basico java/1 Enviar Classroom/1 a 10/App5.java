package app;
// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App5 {
    public static void main(String[] args) throws Exception {

        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        float hp, lp, ha, la;
        int linhaa, colunaa, quantidade;

        System.out.println("Informe a altura da parede em metros: ");
        hp = ler.nextFloat();

        System.out.println("Informe a largura da parede em metros: ");
        lp = ler.nextFloat();

        System.out.println("Informe a altura do azulejo em metros: ");
        ha = ler.nextFloat();

        System.out.println("Informe a largura do azulejo em metros: ");
        la = ler.nextFloat();

        //usando o Método Math.round para redondar o numero para o inteiro mais alto
        colunaa = Math.round((hp / ha));
        linhaa = Math.round((lp / la));

        quantidade = colunaa * linhaa;

        System.out.print("A quantidade de azulejos necessária é de ");
        System.out.println(quantidade);

    }
}