package clase;

public class Saludador {
	
	
	
	private String quien; //="pepitos";
	//private String quien = inicializar();
	
	public static void main(String[] args) {
		//Saludador s=new Saludador("pepito");
		//Saludador s=new Saludador();
		//s.quien="jose";
		//s.saludar();
		/*String s2;
		System.out.println("hola "+s2);*/
	}
/*
	public Saludador()
	{
		this("nadie");
		//quien="pepe";
		System.out.println("-> constructor vacio");
		//this.saludar();
	}
	*/
	public Saludador (String quien)
	{
		this.quien=quien;
		System.out.println("-> constructor con un parametro");
	}
	
	public void saludar(){
		System.out.println("-> metodo saludar");
		System.out.println("Hola "+ this.quien);
	}
}



