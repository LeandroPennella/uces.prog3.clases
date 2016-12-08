package deudor;

import java.io.Serializable;

public class Deudor implements Serializable {


	private static final long serialVersionUID = 1L;


	
	String nombre;
	int edad;
	double saldo;
	//Constructor
	public Deudor(String nombre, int edad, double saldo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.saldo = saldo;
	}
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Deudor [nombre=" + nombre + ", edad=" + edad + ", saldo="
				+ saldo + "]";
	}
	
}
