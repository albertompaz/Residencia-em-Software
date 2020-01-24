/* Programa para calculo de area e perimetro de figuras geometricas
 * Programador: Alberto Paz
 * Data: 11/12/2019 */

package app05;

public class Retangulo implements FiguraGeometrica{
	
	private float base;
	private float altura;
	
	// get para pegar as dimensoes
	public float getBase() {
		return base;
	}

	public float getAltura() {
		return altura;
	}


	public Retangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	public float getArea() {
		float area = base*altura;
		return area;
	}

	public float getPerimetro() {
		float perimetro = base+base+altura+altura;
		return perimetro;
	}

}
