package modelo;
/**
 * Clase perro que hereda de animal
 * 
 * @author Zero
 * @version 8.0
 */
public class Perro extends Animal {
	/**
	 * Constructor con los siguientes parametros
	 * @param nom
	 */
	public Perro(String nom) {
		super(nom);
	}
	/**
	 * metodo ruido que en este caso devuelve que el perro hace guag
	 */
	@Override
	public String ruido() {
	return this.nom+" hace guag";
	}

}
