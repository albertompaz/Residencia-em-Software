package app10;

//Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

// importando as classes a serem usadas
import app06.Administrativo;
import app06.Tecnico;
import app08.CamaroteInferior;
import app08.CamaroteSuperior;
import app08.Normal;
import app09.Novo;
import app09.Velho;
import extras.Cachorro;
import extras.Gato;
import extras.Miseravel;
import extras.Pobre;
import extras.Rica;

public class Teste {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
        Scanner read = new Scanner(System.in);
		
		System.out.println("Informe o teste que voce quer realizar: ");
		System.out.println("1 - Assistente Administrativo e Técnico");
		System.out.println("2 - Cachorro e gato");
		System.out.println("3 - Pessoa Rica, Pobre, Miseravel");
		System.out.println("4 - Ingresso Normal ou Vip");
		System.out.println("5 - Imovel Novo ou Velho");
		//variavel recebendo a resposta. nextInt() pois ira receber um inteiro
		int teste = read.nextInt();
		
		// criando o switch com os 5 testes possiveis
		switch(teste) {
		
			case 1:
				// Testes do app 06
				Administrativo administrativo = new Administrativo();
				Tecnico tecnico = new Tecnico();
				
				// Adicionando valores aos atributos dos objetos
				administrativo.setNome("Guilherme");
				administrativo.setNumMatricula(1111);
				administrativo.setSalario(9200);
				administrativo.setIdade(27);
				administrativo.setTurno("noite");
				administrativo.setAdicionalNoturno(400);
				
				tecnico.setNome("Pedro");
				tecnico.setIdade(18);
				tecnico.setNumMatricula(2992);
				tecnico.setSalario(2000);
				tecnico.setBonusSalarial(1000);
				
				// Imprimindo o numero de matricula e o nome dos 2 objetos
				System.out.println("------ Assistente Administrativo ------");
				System.out.println("Nome: "+administrativo.getNome() );
				System.out.println("Numero de matricula: "+administrativo.getNumMatricula());
				
				System.out.println("------ Técnico ------");
				System.out.println("Nome: "+tecnico.getNome() );
				System.out.println("Numero de matricula: "+tecnico.getNumMatricula());
				break;
			
			case 2:
				// testando o cachorro e gato
		        // criando os objetos
		        Cachorro dog = new Cachorro();
		        Gato cat = new Gato();
		        
		        // testando os metodos caminhar, latir e miar dos respectivos objetos
		        System.out.println("Cachorro latindo: ");
		        dog.latir();
		        
		        System.out.println("\nCachorro caminhando: ");
		        dog.caminhar();
		        
		        System.out.println("\nGato miando: ");
		        cat.miar();
		        
		        System.out.println("\nGato caminhando: ");
		        cat.caminhar();
				break;
			
			case 3:
				// testando o app Pessoa
		        // criando objetos
		        Rica rica = new Rica();
		        Pobre pobre = new Pobre();
		        Miseravel miseravel = new Miseravel();
		        
		        // testando os metodos de cada objeto
		        System.out.println("------ Rico ------");
		        rica.pessoa();
		        rica.situacao();
		        
		        System.out.println("------ Pobre ------");
		        pobre.pessoa();
		        pobre.situacao();
		        
		        System.out.println("------ Miseravel ------");
		        miseravel.pessoa();
		        miseravel.situacao();
				break;
				
			case 4:
				// teste do app08
		        // criando os objetos
		        Normal ingressoNormal = new Normal();
		        CamaroteInferior ingressoCamaroteInferior = new CamaroteInferior();
		        CamaroteSuperior ingressoCamaroteSuperior = new CamaroteSuperior();
		        
		        ingressoNormal.setValor(200);
		        
		        ingressoCamaroteInferior.setValor(200);
		        ingressoCamaroteInferior.setLocalizacaoDoIngresso("parte inferior");
		        ingressoCamaroteInferior.adicional(300);
		        
		        ingressoCamaroteSuperior.setValor(200);
		        ingressoCamaroteSuperior.adicional(300);
		        ingressoCamaroteSuperior.valorAdicioal(500);
		        
		        System.out.println("Informe 1 para ingresso Normal ou 2 para ingresso Vip");
		        int resposta = read.nextInt();
		        
		        if (resposta == 1) {
		        	ingressoNormal.tipoIngresso();
		        	ingressoNormal.imprimeValor();
		        }
		        
		        if (resposta == 2) {
		        	ingressoCamaroteInferior.tipoIngresso();
		        	
		        	System.out.println("Digite 1 para Camarote Superior ou 2 para Camarote Inferior: ");
		        	int resposta2 = read.nextInt();
		        	
		        	if (resposta2 == 1) {
		        		ingressoCamaroteSuperior.tipoIngresso();
		        		System.out.println("Valor do ingresso: "+ingressoCamaroteSuperior.imprimeValor());
		        	} else {
		        		ingressoCamaroteInferior.tipoIngresso();
		        		System.out.println("Valor do ingresso: "+ingressoCamaroteInferior.imprimeValor());
		        	}
		        	
		        }
				break;
				
			case 5:
				// teste do app09  
		        // perguntando o tipo de imovel
		        System.out.println("Digite 1 para imovel novo ou 2 para imovel velho");
		        int resposta3 = read.nextInt();
		        
		        // if para realizar os calculos a partir do tipo de imovel
		        if (resposta3 == 1) {
		        	System.out.println("Informe o adicional do imovel");
		        	float adicional = read.nextFloat();
		        	
		        	// criando o objeto imovel
		            Novo imovelNovo = new Novo();
		            
		            // colocando informaçõe aos seus atributos
		            imovelNovo.setEndereco("Copacabana");
		            imovelNovo.setPreco(1000000);
		            imovelNovo.setAdicional(adicional);
		            
		            System.out.println("Preço a ser pago: "+imovelNovo.getPreco());
		            System.out.println("Adicional a ser pago: "+imovelNovo.getAdicional());
		            System.out.println("Total: "+(imovelNovo.getPreco()+imovelNovo.getAdicional()));
		        
		            // caso o imovel seje velho
		        } else {
		        	System.out.println("Informe o desconto do imovel");
		        	float desconto = read.nextFloat();
		        	
		        	// criando o objeto imovel
		            Velho imovelVelho = new Velho();
		            
		            // colocando informaçõe aos seus atributos
		            imovelVelho.setEndereco("Copacabana");
		            imovelVelho.setPreco(1000000);
		            imovelVelho.setDesconto(desconto);
		            
		            System.out.println("Preço a ser pago: "+imovelVelho.getPreco());
		            System.out.println("Adicional a ser pago: "+imovelVelho.getDesconto());
		            System.out.println("Total: "+(imovelVelho.getPreco()+imovelVelho.getDesconto()));
	        	
		        }
		        
				break;
				
			default:
				System.out.println("Opção não encontrada. Fim do programa");
			
		}
	
	}

}