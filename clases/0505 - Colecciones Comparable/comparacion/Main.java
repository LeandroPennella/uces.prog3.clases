
package comparacion;
import comparacion.Persona;

public class Main {
	public static void main(String[] args) {
	
	Persona p1=null;
	Persona p2=new Persona(22,"pepe");
	Persona p3=new Persona(22,"pepe");
	Persona p4=new Persona(22,"pepes");
	Persona p5=new Persona(24,"pepa");
	Persona p6=p5;
	
	System.out.println(""
			+ "Persona p1=null;" + "\n"
			+ "Persona p2=new Persona(22,'pepe');"+ "\n"
			+ "Persona p3=new Persona(22,'pepe');"+ "\n"
			+ "Persona p4=new Persona(22,'pepes');"+ "\n"
			+ "Persona p5=new Persona(24,'pepa');");
	
	
	System.out.println("\nEquals");
	System.out.println("p1 = : "+ p2.equals(null));
	System.out.println("p2 = p1: "+ p2.equals(p1));
	System.out.println("p2 = p2: "+ p2.equals(p2));
	System.out.println("p2 = p3: "+ p2.equals(p3));
	System.out.println("p2 = p4: "+ p2.equals(p4));
	System.out.println("p6 = p5: "+ p6.equals(p5));
	
	System.out.println("\nHashcode");
	System.out.println("p2: "+ p2.hashCode());
	System.out.println("p3: "+ p3.hashCode());
	System.out.println("p4: "+ p4.hashCode());
	System.out.println("p6: "+ p6.hashCode());
	
	System.out.println("\ncompareTo");
	System.out.println("p2 = p3: "+ p2.compareTo(p3));
	System.out.println("p2 = p4: "+ p2.compareTo(p4));
	System.out.println("p2 = p5: "+ p2.compareTo(p5));
	
	
		
}
}
