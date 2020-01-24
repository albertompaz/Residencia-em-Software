package app03;

//Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class Loja {
	
	private static void busca(int codigo, int[] vetorCodigos) {
		// Loop para verificar se o codigo bate com cada posição no vetor
		for (int i=0; i< vetorCodigos.length; i++) {
			// se o codigo for igual informara, se não informara que nao encontrou
			if (codigo == vetorCodigos[i]) {
				System.out.println("Produto encontrado, posição: "+(i+1));
			} else {
				System.out.println("Produto não encontrado");
			}
		}
		
	}

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
        
        // vetores para receber os codigos dos produtos
        int codigosL[] = null;
        int codigosC[] = null;
        int codigosD[] = null;
        
        // verificando se a quantidade informada para livros é maior que zero
        if (l > 0) {
        	System.out.println("------ Adicionando Livro ------");
        	
        	// passando a quantidade de posições do vetor Objeto Livro
        	livros = new Livro[l];
        	
        	//Passando a quantidade de posições do vetor de codigos;
        	codigosL = new int[l];
        	
        	// loop de posições igual ao informada
        	for (int i=0; i<l; i++) {
        		
        		// Salvando as variaveis que o construtor usará
        		System.out.println("Informe o nome: ");
        		// .next() pois ira receber uma string
        		String nome = read.next();
        		
        		System.out.println("Informe o preço: ");
        		// .nextFloat() pois ira receber um valor float
        		float preco = read.nextFloat();
        		
        		System.out.println("Informe o codigo de barras: ");
        		int codigo = read.nextInt();
        		
        		System.out.println("Informe o autor: ");
        		String autor = read.next();
        		
        		// criando o objeto livro chamando o construtor
        		livros[i] = new Livro(nome, preco, codigo, autor);
        		
        		// Passando o valor do codigo para o vetor de codigos
        		codigosL[i] = livros[i].codigoDeBarras;
        		
        	}
        }
        
        if (c>0) {
        	System.out.println("------ Adicionando CD ------");
        	
        	cds = new CD[c];
        	
        	codigosC = new int[c];
        	
        	for (int i=0; i<c; i++) {
        		
        		System.out.println("Informe o nome: ");
        		String nome = read.next();
        		
        		System.out.println("Informe o preço: ");
        		float preco = read.nextFloat();
        		
        		System.out.println("Informe o codigo de barras: ");
        		int codigo = read.nextInt();
        		
        		System.out.println("Informe a numero de faixas: ");
        		int nFaixas = read.nextInt();
        		
        		cds[i] = new CD(nome, preco, codigo, nFaixas);
        		
        		codigosC[i] = cds[i].codigoDeBarras;
        	}
        }
        
        if (d>0) {
        	System.out.println("------ Adicionando CD ------");
        	
        	dvds = new DVD[d];
        	
        	codigosD = new int[d];
        	
        	for (int i=0; i<d; i++) {
        		        		
        		System.out.println("Informe o nome: ");
        		String nome = read.next();
        		
        		System.out.println("Informe o preço: ");
        		float preco = read.nextFloat();
        		
        		System.out.println("Informe o codigo de barras: ");
        		int codigo = read.nextInt();
        		
        		System.out.println("Informe a duração: ");
        		float duracao = read.nextFloat();
        		
        		dvds[i] = new DVD(nome, preco, codigo, duracao);
        		
        		codigosD[i] = dvds[i].codigoDeBarras;
        	}
        }

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
        
        // Perguntando se quer realizar uma busca de produtos
        System.out.println("Deseja efetuar uma busca de algum produto? s ou n ");
        char resposta =  read.next().charAt(0); 
        
        if (resposta == 's') {
        	
        	System.out.println("Deseja buscar um livro(l), CD(c) ou DVD(d)");
        	char resposta2 = read.next().charAt(0);
        	
        	// cadeia de ifs a ser executado dependendo da resposta
        	if (resposta2 == 'l') {
        		System.out.println("Informe o codigo de barras do produto: ");
        		int codigo = read.nextInt();
        		busca(codigo, codigosL);	
        		
        	}
        	
        	if (resposta2 == 'c') {
        		System.out.println("Informe o codigo de barras do produto: ");
        		int codigo = read.nextInt();
        		busca(codigo, codigosC);
        	}
        	
        	if (resposta2 == 'd') {
        		System.out.println("Informe o codigo de barras do produto: ");
        		int codigo = read.nextInt();
        		busca(codigo, codigosD);
        	}
        	
        } else {
        	System.out.println("------ Fim do Programa ------");
        }
     
        read.close();
	}

}
