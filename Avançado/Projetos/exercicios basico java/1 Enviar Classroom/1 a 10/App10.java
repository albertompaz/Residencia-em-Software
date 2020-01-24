package app;
// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App10 {
    public static void main(String[] args) throws Exception {

        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        float venda1, venda2, venda3, venda4, venda5, comissao1, comissao2, comissao3, comissao4, comissao5, 
        total, media;

        System.out.println("Informe a venda do vendedor 1: ");
        venda1 = ler.nextFloat();

        System.out.println("Informe a venda do vendedor 2: ");
        venda2 = ler.nextFloat();

        System.out.println("Informe a venda do vendedor 3: ");
        venda3 = ler.nextFloat();

        System.out.println("Informe a venda do vendedor 4: ");
        venda4 = ler.nextFloat();

        System.out.println("Informe a venda do vendedor 5: ");
        venda5 = ler.nextFloat();
        
        //Calculo das comissoes
        comissao1 = venda1 * 10 / 100;
        comissao2 = venda2 * 10 / 100;
        comissao3 = venda3 * 10 / 100;
        comissao4 = venda4 * 10 / 100;
        comissao5 = venda5 * 10 / 100;

        //Calculo do total de vendas
        total = venda1 + venda2 + venda3+ venda4 + venda5;

        //Calculo da media
        media = (venda1 + venda2 + venda3+ venda4 + venda5) / 5;

        System.out.println("A comessao do vendedor 1 e de: " + comissao1);
        System.out.println("A comessao do vendedor 2 e de: " + comissao2);
        System.out.println("A comessao do vendedor 3 e de: " + comissao3);
        System.out.println("A comessao do vendedor 4 e de: " + comissao4);
        System.out.println("A comessao do vendedor 5 e de: " + comissao5);

        System.out.println("O total de vendas e de: " + total);

        System.out.println("A media de vendas e de: " + media);
    }
}