package Mainapp;

import Models.Animal;
import Models.DobleLikedList;

public class Main {

	public static void main(String[] args) {

//		Animal p1 = null;
		Animal p1 = new Animal("Uno");
		Animal p2 = new Animal("Dos");
		Animal p3 = new Animal("Tres");
		Animal p4 = new Animal("Cuatro");
		Animal p5 = new Animal("cinco");
		DobleLikedList<Animal> Examen = new DobleLikedList<Animal>();
		//Examen.add(p1);
		Examen.add(p1);
		Examen.add(p2);
		Examen.add(p3);
		Examen.add(p4);
		Examen.add(p5);
		System.out.println(Examen.getPrev());

		System.out.println(Examen.getNext());
		Examen.setIndex2(3);
		System.out.println(Examen.getCurrent());
//		Examen.remove();
//		Examen.getElementos().forEach(System.out::println);
		
	}
}
