/* Programa para calculo de area e perimetro de figuras geometricas
 * Programador: Alberto Paz
 * Data: 11/12/2019 */

package app05;

public abstract class Quadrilatero implements FiguraGeometrica{

	protected float lado1;
	protected float lado2;
	protected float lado3;
	protected float lado4;
	
	// criando construtor
	public Quadrilatero (float lado1, float lado2, float lado3, float lado4) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}

	// sobreescrevendo os metodos da interface
	
	@Override
	public float getPerimetro() {
		float perimetro = lado1+lado2+lado3+lado4;
		return perimetro;
	}
	
}
