package semaforo;


public class Rojo extends Estado{
	public Estado cambiar()
	{
		return new RojoAmarillo();
	}
	public String obtenerNombre()
	{
		return "Rojo"; 
	}
}
