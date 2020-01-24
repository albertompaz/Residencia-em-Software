/* Programa para criar uma agenda de contatos
 * Programador: Alberto Paz
 * Data: 09/12/2019 */

package App02;

//Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class Agenda extends Contato{

	private String anotacao;
	
	// criando get e set
	public String getAnotacao() {
		return anotacao;
	}

	public void setAnotacao(String anotacao) {
		this.anotacao = anotacao;
	}

	public static void main(String[] args) {

		// Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);
		
        // criando um vetor de objetos Agenda
        Agenda[] ag = new Agenda[100];
		
        // contador para controlar o array de objetos
        int cont = 0;
        
		char adicionar = 's';
		// preenchendo o vetor com o loop
		while (adicionar == 's') {
			// Iniciando o Objeto Agenda
			ag[cont] = new Agenda();
			
			// Salvando as informações no objeto
			System.out.println("Informe o nome: ");
			//ler.next() pois retornara uma string
			ag[cont].setNome(ler.next());
			
			System.out.println("Informe o telefone");
			// .nextInt pois ira retornar um inteiro
			ag[cont].setTelefone(ler.nextInt());
			
			System.out.println("Informe o email");
			ag[cont].setEmail(ler.next());
			
			System.out.println("Faca anotações: ");
			ag[cont].setAnotacao(ler.next());
			
			
			System.out.println("Quer informar outro produto para seu pedido? s-sim, n-nao");
			
			// if para controlar o contador, se for adicionar um novo pedido, o contador soma +1
				if (adicionar == 's') {
					cont += 1;
				}
				
			// fazendo o scaner entender o next(), que é string, como char	
			adicionar = ler.next().charAt(0);
		}
		
		ler.close();
		
		System.out.println("Seus Contatos: ");
		// loop para escrever os dados do vetor de objetos
			for (int i=0; i<cont; i++) {
				int posicao = i + 1;
				System.out.println("Contato "+posicao+":");
				System.out.println("Nome: "+ag[i].getNome());
				System.out.println("Telefone: "+ag[i].getTelefone());
				System.out.println("Email: "+ag[i].getEmail());
				System.out.println("Anotação: "+ag[i].getAnotacao());		
			}
		
	}
	
}
