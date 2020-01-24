/* Programa para calculo de area e perimetro de figuras geometricas
 * Programador: Alberto Paz
 * Data: 11/12/2019 */

package app05;

//Importando o pacote Scanner para ler dados de entrada do usuario
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Instanciando e criando um objeto Scanner:
        Scanner read = new Scanner(System.in);
        
        System.out.println("Quantas formas deseja criar?");
        // .nextInt() pois estarecebendo um inteiro
        int nFormas = read.nextInt();
        
        System.out.println("Deseja criar quadrados(q), retangulos(r) ou circulos(c)?");
    	char resposta = read.next().charAt(0);
    	
    	// if para verificar a resposta do usuario
    	if (resposta == 'q') {
    		// criando o vetor de objetos quadrados com o numero passado
    		Quadrado[] quadrados = new Quadrado[nFormas];
    		
    		for (int i=0; i<nFormas; i++) {
    			System.out.println("Informe o lado do quadrado "+(i+1)+": ");
    			float lado = read.nextFloat();
    			
    			// criando o objeto quadrado
    			quadrados[i] = new Quadrado(lado);
    		}
    		
    		System.out.println("------ Impressão dos resultados ------");
    		// for para imprimir os resultados
    		for (int i=0; i<nFormas; i++) {
    			System.out.println("------ Quadrado "+(i+1)+" ------");
    			
    			System.out.println("lado: "+quadrados[i].getLado());
    			System.out.println("Perimetro: "+quadrados[i].getPerimetro());
    			System.out.println("Area: "+quadrados[i].getArea());
    		}
    		
    	}
    	
    	if (resposta == 'r') {
    		// criando o vetor de objetos quadrados com o numero passado
    		Retangulo[] retangulos = new Retangulo[nFormas];
    		
    		for (int i=0; i<nFormas; i++) {
    			System.out.println("Informe a base do retangulo "+(i+1)+": ");
    			float base = read.nextFloat();
    			
    			System.out.println("Informe a altura do retangulo "+(i+1)+": ");
    			float altura = read.nextFloat();
    			
    			// criando o objeto quadrado
    			retangulos[i] = new Retangulo(base, altura);
    		}
    		
    		System.out.println("------ Impressão dos resultados ------");
    		// for para imprimir os resultados
    		for (int i=0; i<nFormas; i++) {
    			System.out.println("------ Retangulo "+(i+1)+" ------");
    			
    			System.out.println("base: "+retangulos[i].getBase());
    			System.out.println("altura: "+retangulos[i].getAltura());
    			System.out.println("Perimetro: "+retangulos[i].getPerimetro());
    			System.out.println("Area: "+retangulos[i].getArea());
    		}
    		
    	}
    	
    	if (resposta == 'c') {
    		// criando o vetor de objetos quadrados com o numero passado
    		Circulo[] circulos = new Circulo[nFormas];
    		
    		for (int i=0; i<nFormas; i++) {
    			System.out.println("Informe o raio do circulo "+(i+1)+": ");
    			float raio = read.nextFloat();
    			
    			// criando o objeto quadrado
    			circulos[i] = new Circulo(raio);
    		}
    		
    		System.out.println("------ Impressão dos resultados ------");
    		// for para imprimir os resultados
    		for (int i=0; i<nFormas; i++) {
    			System.out.println("------ Quadrado "+(i+1)+" ------");
    			
    			System.out.println("lado: "+circulos[i].getRaio());
    			System.out.println("Perimetro: "+circulos[i].getPerimetro());
    			System.out.println("Area: "+circulos[i].getArea());
    		}
    		
    	}
    	
    	read.close();

	}

}
