package consola;

import entidades.Bombilla;

public class App {

	public static void main(String[] args) {
		//creo objetos bombilla
		Bombilla b1 = new Bombilla("Cunera", 0, false, "Verde pistacho");
		System.out.println("\nBombilla1 ------------------------------------------------------\n"+b1);
		
		Bombilla b2; //no la instancio
		b2 = b1; //igualo
		System.out.println("Bombilla2 ------------------------------------------------------\n"+b2);
		
		
		//modifico potencia de b1
		b1.setPotencia(50);
		
		//mostrar por consola los valores de los atributos de ambas bombillas
		System.out.println("\nBombilla1 ------------------------------------------------------\n"+b1);
		System.out.println("Bombilla2 ------------------------------------------------------\n"+b2);
	}

}