package test;

import modelo.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perro p = new Perro("Tobie");
		Gato g = new Gato("Fyra");
		System.out.println(g.ruido());
		System.out.println(p.ruido());
	}

}
