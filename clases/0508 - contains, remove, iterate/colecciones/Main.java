package colecciones;

import colecciones.Persona;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Juan"=="Juan");
		
		System.out.println(new String("Juan")==new String("Juan"));
		
		Collection<Persona> personas = new ArrayList<Persona>();
		Persona p1 = new Persona(2, "pepe");
		Persona p2 = new Persona(3, "pepa");
		personas.add(p1);
		personas.add(p2);
		personas.add(new Persona(4,"pepote" ));
		
		for (Persona p : personas) {
			System.out.println(p.getNombre() + " - " + p.getEdad());
		}
		
		System.out.println("============");

		System.out.println("esta pepa? > " + personas.contains(new Persona(3,"pepa")));	
		
		System.out.println("============");

		personas.remove(p2);
		
		Iterator<Persona> i = personas.iterator();
		while (i.hasNext()) {
			Persona p=i.next();
			System.out.println(p.getNombre() + " - " + p.getEdad());
		}
		
		personas.remove(new Persona(2,"pepe")); // si no esta implementado comparable no funca

		System.out.println("============");

		System.out.println("esta pepa? > " + personas.contains(new Persona(3,"pepa")));	
		
		System.out.println("============");

		/* TODO: sacar a todas las personas mayores de x*/
		//Collection<Persona> personasMayores=personas.stream().filter(p -> p.getAge() > 16).collect(Collectors.toList());
		//personas.removeAll(personas)
		
		
		for (Persona p : personas) {
			System.out.println(p.getNombre() + " - " + p.getEdad());
		}
	}
}
