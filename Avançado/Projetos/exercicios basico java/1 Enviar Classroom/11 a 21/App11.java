/* Programa para verificar se uma pessoa pode ou nao realizar um emprestimo
 * Programador: Alberto Paz
 * Data: 05/12/2019 */

package app;
// Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App11 {
    public static void main(String[] args) throws Exception {

        // Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);

        //variaveis a serem usadas
        float salarioB, salarioL, descontos, emprestimoPedido, emprestimoPermitido;

        System.out.println("Informe o seu salario bruto: ");
        salarioB = ler.nextFloat();
        System.out.println("Informe os descontos: ");
        descontos = ler.nextFloat();
        System.out.println("Informe o emprestimo requerido: ");
        emprestimoPedido = ler.nextFloat();

        ler.close();

        // O emprestimo permitido é de 30% em cima do salario liquido da pessoa
        emprestimoPermitido = (salarioB - descontos) * 30 / 100;

        //Realizando um If/Else para verificar em qual situação cairá
        if (emprestimoPedido <= emprestimoPermitido) {
            System.out.println("Ok! Voce pode realizar esse emprestimo de: "+emprestimoPedido);
        } else {
            System.out.println("Erro! Voce não pode realizar o emprestimo de: "+emprestimoPedido+". O seu valor limite de emprestimo é de: "+emprestimoPermitido);
        }
    }
}