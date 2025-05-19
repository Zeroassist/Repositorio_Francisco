/**
 * 
 */
package modelo;

/**
 * Clase abstracta para probar herencia
 * 
 * @author Zero
 * @version 1.0 
 */
public abstract class Animal {
	
	protected String nom;

	public Animal(String nom) {
		super();
		this.nom = nom;
	}
	
	public Animal() {
		super();
	}
	/**
	 * El metodo encargado de devolver el nombre del animal
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * El metodo encargado de insertar el nombre del animal
	 * @param name al que nom se le asigna el valor
	 */
	public void setNom(String name) {
		this.nom = name;
	}
	/**
	 * Metodo para generar un String con toda la info e la clase
	 */
	@Override
	public String toString() {
		return "Animal [nom=" + nom + "]";
	}
	/**
	 * Metodo abstracto que implementaran las clases hijas
	 */
	public abstract String ruido();
	
}
