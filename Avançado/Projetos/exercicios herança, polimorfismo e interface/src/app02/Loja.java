package app02;

//Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
        Scanner read = new Scanner(System.in);
        
        // Perguntando quantos de cada item adicionar criar
        System.out.println("Quantos Livros ira adicionar: ");
        int l = read.nextInt();
        
        System.out.println("Quantos CD's ira adicionar: ");
        int c = read.nextInt();
        
        System.out.println("Quantos DVD's ira adicionar: ");
        int d = read.nextInt();
        
        // iniciando os vetores de objetos aqui para eles poderem ser acessados depois na hora de escreve-los
        Livro[] livros = null;
        CD[] cds = null;
        DVD[] dvds = null;
        
        // verificando se a quantidade informada para livros é maior que zero
        if (l > 0) {
        	System.out.println("------ Adicionando Livro ------");
        	
        	// passando a quantidade de posições do vetor Objeto Livro
        	livros = new Livro[l];
        	// loop de posições igual ao informada
        	for (int i=0; i<l; i++) {
        		
        		// Salvando as variaveis que o construtor usará
        		System.out.println("Informe o nome: ");
        		// .next() pois ira receber uma string
        		String nome = read.next();
        		
        		System.out.println("Informe o preço: ");
        		// .nextFloat() pois ira receber um valor float
        		float preco = read.nextFloat();
        		
        		System.out.println("Informe o autor: ");
        		String autor = read.next();
        		
        		// criando o objeto livro chamando o construtor
        		livros[i] = new Livro(nome, preco, autor);
        		
        	}
        }
        
        if (c>0) {
        	System.out.println("------ Adicionando CD ------");
        	
        	cds = new CD[c];
        	
        	for (int i=0; i<c; i++) {
        		
        		System.out.println("Informe o nome: ");
        		String nome = read.next();
        		
        		System.out.println("Informe o preço: ");
        		float preco = read.nextFloat();
        		
        		System.out.println("Informe a numero de faixas: ");
        		int nFaixas = read.nextInt();
        		
        		cds[i] = new CD(nome, preco, nFaixas);
        	}
        }
        
        if (d>0) {
        	System.out.println("------ Adicionando CD ------");
        	
        	dvds = new DVD[d];
        	
        	for (int i=0; i<d; i++) {
        		        		
        		System.out.println("Informe o nome: ");
        		String nome = read.next();
        		
        		System.out.println("Informe o preço: ");
        		float preco = read.nextFloat();
        		
        		System.out.println("Informe a duração: ");
        		float duracao = read.nextFloat();
        		
        		dvds[i] = new DVD(nome, preco, duracao);
        		
        	}
        }
        
        read.close();

        System.out.println("------ Conteudo dos vetores ------");
        
        // Impressão usando o método toString();
        System.out.println("------ Livros ------");
        
        for (int i=0; i<l; i++) {
        	System.out.println(livros[i].toString());
        }
        
        System.out.println("------ CDs ------");
        
        for (int i=0; i<c; i++) {
        	System.out.println(cds[i].toString());
        }
        
        System.out.println("------ DVDs ------");
        
        for (int i=0; i<d; i++) {
        	System.out.println(dvds[i].toString());
        }
	}

}
