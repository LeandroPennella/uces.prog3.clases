package Mapas;

public class Aeropuerto {
	
	private String nombre;
	private double longitud;
	private double latitud;
	
	public Aeropuerto(String nombre, double latitud, double longitud)
	{
		this.latitud=latitud;
		this.longitud=longitud;
		this.nombre=nombre;
	}
	
	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", longitud=" + longitud
				+ ", latitud=" + latitud + "]";
	}
	
	public String getNombre() {
		return nombre;
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

}
