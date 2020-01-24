package app;
// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App6 {
    public static void main(String[] args) throws Exception {

        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        float areaTotal, areaConstruida, areaNConstruida;

        //valor recebendo tipo double pois o programa está marcando como erro se ele tiver o tipo de float
        double valor;

        System.out.println("Informe a área total do terreno em metros quadrados: ");
        areaTotal = ler.nextFloat();

        System.out.println("Informe a área construida do terreno em metros quadrados: ");
        areaConstruida = ler.nextFloat();

        areaNConstruida = areaTotal - areaConstruida;

        valor = (areaConstruida * 5) + (areaNConstruida * 3.80);

        System.out.println("O valor do imposto a ser pago é de: " + valor);
    }
}