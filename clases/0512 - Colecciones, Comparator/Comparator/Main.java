package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {

		
		//PersonaComparatorEdadDescNombre c=new PersonaComparatorEdadDescNombre();
		//TreeSet personas=new TreeSet<Persona>(c);
		
		List<Persona> personas = new ArrayList<Persona>();
		
		Persona p1 = new Persona(42, "pepe");
		Persona p2 = new Persona(32, "pepe");
		Persona p3 = new Persona(21, "jose");
		Persona p4 = new Persona(32, "pepa");
		Persona p5 = new Persona(32, "pepe");

		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		personas.add(p5);

		for (Persona p : personas) {
			System.out.println(p.getNombre() + " - " + p.getEdad());
		}

		System.out.println("==");
		
		Collections.sort(personas, new PersonaComparatorEdadDescNombre());

		
		for (Persona p : personas) {
			System.out.println(p.getNombre() + " - " + p.getEdad());
		}
		
		

	}
}
