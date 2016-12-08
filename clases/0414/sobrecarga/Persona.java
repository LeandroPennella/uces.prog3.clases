package sobrecarga;

public class Persona {

protected int edad;
protected String nombre;

public Persona(){}

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

@Override
public String toString()
{
	return "me llamo " + this.nombre + " y tengo " + this.edad + " años";
}

}
