/* Programa para criar um método que recebe um array de inteiros a e um valor inteiro x e retorna a quantidade de vezes que x aparece no array a.
 * Programador: Alberto Paz
 * Data: 05/12/2019 */


//Importando o pacote ArrayList para criara vetores que não precisam de dimensões
import java.util.ArrayList;
//Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class App05 {
    public static void main(String[] args) throws Exception {

    	// Instanciando e criando um objeto Scanner:
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o numero que voce quer verificar na lista: ");
        //nextInt pois a variavel x é do tipo inteira
        int x = ler.nextInt();
        
        //criando o ArrayList 'a' que é um vetor qu não precisa de dimensão
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        char ficar = 's';

        //preenchendo o vetor com o loop
        while (ficar == 's') {
            System.out.println("Informe um numero negativo ou positivo para a lista");
            //adicionando numero informado ao vetor
            a.add(ler.nextInt());

            System.out.println("Quer informar um numero pra lista? s-sim, n-nao");
            //fazendo o scaner entender o next() que é string como char
            ficar = ler.next().charAt(0);
        }

        ler.close();
        
        System.out.println("A quantidade de vezes que o numero "+x+" aparece e: "+repete(a,x));
    }
    
    public static int repete (ArrayList<Integer> a, int x) {
    	//contador para mostrar quantas vezes o x se repete no vetor a
    	int contador = 0;
    	
    	//usando um forEach do ArrayList() para verificar se x e igual a cada posição do vetor, a sintax é diferente da convencional
    	for (int element: a) {
    		if (element == x) {
    			contador++;
    		}
    	}
    	
    	return contador;
    }
}
