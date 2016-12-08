package edad;

public abstract class Persona {

protected int edad;
protected String nombre;

public Persona(String nombre, int edad)
{
	this.edad=edad;
	this.nombre=nombre;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public void decirEdad()
{
	System.out.println("tengo "+ this.getEdad()+ " años");
	}
}
