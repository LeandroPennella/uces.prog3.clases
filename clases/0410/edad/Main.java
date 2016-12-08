package edad;

public class Main {
	public static void main(String[] args) {
		//Persona persona=new Persona("pepe",23);
		Hombre hombre=new Hombre ("pepe",23);
		Mujer mujer=new Mujer("pepa",23);
		hombre.decirEdad();
		mujer.decirEdad();
	}

}
