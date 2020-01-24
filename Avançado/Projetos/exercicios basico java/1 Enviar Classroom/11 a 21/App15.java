/* Programa para verificar o possivel valor de emprestimo para um funcionario da empresa
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

package app;
// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App15 {
    public static void main(String[] args) throws Exception {

        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        String cargo = "";

        System.out.println("Informe o seu cargo: diretoria, gerencia ou operacional.");
        //ler.next pois é uma String
        cargo = ler.next();

        ler.close();

        //verificando o cargo dapessoa. Pois o emprestimo depende do cargo
        switch (cargo) {
            case "diretoria":
                System.out.println("Valor de empréstimo possivel: 30%");
                break;
            case "gerencia":
                System.out.println("Valor de empréstimo possivel: 25%");
                break;
            case "operacional":
                System.out.println("Valor de empréstimo possivel: 20%");
                break;
        }

    }
}