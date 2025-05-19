package modelo;
/**
 * Clase gato que hereda de animal
 * 
 * @author Zero
 * @version 1.0
 */
public class Gato extends Animal {
	
	public Gato(String nom) {
		super(nom);
	}
	/**
	 * El metodo heredado, en este casi devolvera que el gato hace miau
	 */
	@Override
	public String ruido() {
		// TODO Auto-generated method stub
		return this.nom+" hace miau";
	}

}
