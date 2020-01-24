/* Programa para calculo de area e perimetro de figuras geometricas
 * Programador: Alberto Paz
 * Data: 11/12/2019 */

package app05;

public class Circulo implements FiguraGeometrica {
	
	private float raio;
	
	// get para pegar o Raio
	public float getRaio() {
		return raio;
	}

	public Circulo (float raio) {
		this.raio = raio;
	}
	
	public float getArea() {
		// calculo da area/ pi*raio*raio
		// (float) para indicar que é float e nao double
		float area = (float) (3.14*raio*raio);
		return area;
	}

	public float getPerimetro() {
		// calculo do perimetro: 2*pi*R
		float perimetro = (float) (2*3.14*raio);
		return perimetro;
	}
	
}
