package edad;

public class Mujer extends Persona{
	
	public Mujer(String nombre, int edad)
	{
		super(nombre,edad);
	}
	
	@Override
	public int getEdad() {
		return edad-3;
	}
}
