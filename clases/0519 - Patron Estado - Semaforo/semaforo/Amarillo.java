package semaforo;


public class Amarillo extends Estado {
	public Estado cambiar()
	{
		return new Rojo();
	}
	public String obtenerNombre()
	{
		return "Amarillo"; 
	}
}
