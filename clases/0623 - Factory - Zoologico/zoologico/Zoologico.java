package zoologico;

import jaulas.Jaula;
import jaulas.JaulaFaisan;
import jaulas.JaulaTigre;
import animales.Animal;

public class Zoologico {
public static void main(String[] args) {
	Jaula jaula=new JaulaTigre();
	
	Cuidador pepe=new Cuidador();
	Animal animal=pepe.crearAnimal(jaula);
	System.out.println(animal.getClass());
	
	jaula=new JaulaFaisan();
	animal=pepe.crearAnimal(jaula);
	System.out.println(animal.getClass());
}
}
