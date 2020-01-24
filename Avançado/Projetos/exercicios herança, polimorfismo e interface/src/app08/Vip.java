/* Programa para criar um controle de ingressos
 * Programador: Alberto Paz
 * Data: 12/12/2019 */

package app08;

public class Vip extends Ingresso {

	// metodo que adiciona um valor adicional ao ingresso.
	public float adicional(float adicional) {
		this.valor = valor+adicional;
		return valor;
	}
	
	public void tipoIngresso() {
		System.out.println("Ingresso Vip");
	}
	
}
