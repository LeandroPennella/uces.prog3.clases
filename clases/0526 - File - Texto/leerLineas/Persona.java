package leerLineas;

import java.util.StringTokenizer;

public class Persona {
	private String nombre;
	private int edad;
	public Persona(String cadena)
	{
		StringTokenizer s=new StringTokenizer(cadena,",");
		this.nombre=s.nextToken();
		this.edad=Integer.parseInt(s.nextToken());
		
	}
	
	public String getNombre(){return this.nombre;}
	public int getEdad(){return this.edad;}
	@Override
	public String toString()
	{return "nombre :" + this.nombre + " - Edad: "+ this.edad;}
	
 
}
