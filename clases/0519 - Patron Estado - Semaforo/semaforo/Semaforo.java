package semaforo;

public class Semaforo {
private Estado estado;
public Semaforo()
{
	this.estado=new Rojo();
}
public String cambiar(){
	
	this.estado=estado.cambiar();
	return estado.obtenerNombre();
}
}
