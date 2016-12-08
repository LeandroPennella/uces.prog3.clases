package contador.modelo;
import contador.excepciones.*;

public class Inestable1 extends Inestable {

	public Inestable1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hacer() throws InestableException1
	{
		throw new InestableException1("");
	}
}
