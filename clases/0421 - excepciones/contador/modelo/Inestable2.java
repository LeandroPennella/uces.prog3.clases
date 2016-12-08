package contador.modelo;
import contador.excepciones.*;

public class Inestable2 extends Inestable {

	public Inestable2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hacer() throws InestableException
	{
		throw new InestableException2("");
	}
}
