package contador.modelo;
import contador.excepciones.*;

public class Contador {

	private int llamadas;
	private int e1;
	private int e2;
	
	public Contador() {
		// TODO Auto-generated constructor stub
	}
	
	public void ejecutar(Inestable[] lista) throws InestableException
	{
		this.llamadas=0;
		this.e1=0;
		this.e2=0;

		System.out.println("tamaño lista: "+ lista.length);
		for(Inestable i:lista)
		{
			try{
				System.out.println("/"
						+ " iteracion");
				i.hacer();
			}
			catch(InestableException1 e){
				System.out.println("  InestableException1");
				e1++;
			} catch(InestableException2 e){
				System.out.println("  InestableException2");
				e2++;
			} catch (InestableException e){
				System.out.println("  InestableException");
				throw new InestableException();
			} /*catch (Exception e){
				System.out.println("  Exception");
				throw new InestableException();
			}*/
			finally{
				System.out.println("\\ finally");
				llamadas++;
			}
		} 
	}
	
	public void mostrar(){
		System.out.println("llamadas: " + this.llamadas + "\n");
		System.out.println("InEx1: " + this.e1+ "\n");
		System.out.println("InEx2: " + this.e2+ "\n");
		
	}
	

}
