package semaforo;


public class RojoAmarillo extends Estado {
	public Estado cambiar()
	{
		return new Verde();
	}
	public String obtenerNombre()
	{
		return "Amarillo"; 
	}
}
