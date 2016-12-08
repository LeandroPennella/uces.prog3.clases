package contador.mains;
import contador.excepciones.InestableException;
import contador.modelo.Contador;
import contador.modelo.Estable;
import contador.modelo.Inestable;
import contador.modelo.Inestable1;
import contador.modelo.Inestable2;

public class Main {

	public static void main(String[] args) throws InestableException{
		// TODO Auto-generated method stub
		Contador contador=new Contador();
		Inestable[] lista=new Inestable[]{new Inestable1(), new Inestable2(), new Estable()};
		contador.ejecutar(lista);
		contador.mostrar();
	}

}
