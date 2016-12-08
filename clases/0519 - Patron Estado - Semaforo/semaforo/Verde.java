package semaforo;


public class Verde extends Estado {
	public Estado cambiar()
	{
		return new Amarillo();
	}
	public String obtenerNombre()
	{
		return "Verde"; 
	}
}
