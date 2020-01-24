/* Programa para gerenciar os produtos de uma loja
 * Programador: Alberto Paz
 * Data: 09/12/2019 */

package App01;

//Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);
        
        // Criando objeto produtos
        Produto pr1 = new Produto();
        // atribuindo valores a seus atributos
        pr1.setItem(1);
        pr1.setPreco(10);
        pr1.setQuantidadeEstoque(200);
        
        Produto pr2 = new Produto();
        pr2.setItem(2);
        pr2.setPreco(200);
        pr2.setQuantidadeEstoque(5);
        
        Produto pr3 = new Produto();
        pr3.setItem(3);
        pr3.setPreco(50);
        pr3.setQuantidadeEstoque(500);

        // criando um vetor de objetos Pedido
        Pedido[] pedidos = new Pedido[100];
        
        // contador para controlar o array de objetos
        int cont = 0;
        
        char adicionar = 's';
		// preenchendo o vetor com o loop
		while (adicionar == 's') {
			// Iniciando o Objeto Pedido
			pedidos[cont] = new Pedido();
			
			System.out.println("Informe o item: " );
			// salvando as informações no objeto
			// .nextInt pois ira retornar um inteiro
			pedidos[cont].setItens(ler.nextInt());
			
			System.out.println("Informe a quantidade: ");
			pedidos[cont].setQuantidade(ler.nextInt());
	
			
			System.out.println("Quer informar outro produto para seu pedido? s-sim, n-nao");
			
			// if para controlar o contador, se for adicionar um novo pedido, o contador soma +1
			if (adicionar == 's') {
				cont += 1;
			}
			
			// fazendo o scaner entender o next(), que é string, como char
			adicionar = ler.next().charAt(0);
		}
		
		// Iniciando o objeto pagamento
		Pagamento pg = new Pagamento();
		
		System.out.println("Informe o tipo de pagamento: dinheiro, cheque ou cartao");
		pg.setTipoPagamento(ler.next());
		
		ler.close();
		
		System.out.println("Voce esta comprando:");
		// loop para escrever os dados do vetor de objetos
		for (int i=0; i<cont; i++) {
			System.out.print("Item: ");
			System.out.print(pedidos[i].getItens());
			System.out.print(" -- Quantidade: ");
			System.out.println(pedidos[i].getQuantidade());
		}
		
		System.out.println("Sua forma de pagamento é: "+pg.getTipoPagamento());
        
	}

}
