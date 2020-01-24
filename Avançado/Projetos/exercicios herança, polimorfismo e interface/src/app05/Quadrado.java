/* Programa para calculo de area e perimetro de figuras geometricas
 * Programador: Alberto Paz
 * Data: 11/12/2019 */

package app05;

public class Quadrado implements FiguraGeometrica{
	
	private float lado;

	public Quadrado(float lado) {
		this.lado = lado;
	}

	// get para retornar o lado
	public float getLado() {
		return lado;
	}
	
	public float getArea() {
		float area = lado*lado;
		return area;
	}

	public float getPerimetro() {
		float perimetro = lado*4;
		return perimetro;
	}

}
