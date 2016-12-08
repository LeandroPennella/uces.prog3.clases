package colecciones;

public class Persona implements Comparable<Persona>{
	private int edad;
	private String nombre;
	
	public Persona(int edad, String nombre)
	{
		this.edad=edad;
		this.nombre=nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode()							// devuelve una representacon de tipo entero- no univoca - del objeto  
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)				// evalua si otro objeto es equivalente 
	{				
		if (this == obj) 							// se fija si son la misma instancia
			return true;
		if (obj == null)							// this no puede ser nunca nulo, asi que si el otro es nulo no va
			return false;
		if (getClass() != obj.getClass())			// se fija si el otro es de la misma clase | instanceof
			return false;
		Persona other = (Persona) obj;				// una vez que sabe que el otro es Persona, castea al otro a Persona
		if (edad != other.edad)							
			return false;
		if (nombre == null){						 //si mi nombre es nul
			if (other.nombre != null)					// y el nombre del otro no es nulo 
				return false;							// devuelve false
		}
		else 										// si mi nombre no es nulo
			if (!nombre.equals(other.nombre))			// y los nombres no son iguales | o nombre del otro es null 					
			return false;								// devuelve false
		
		return true;
	}
	
	@Override
	public int compareTo(Persona otro)					//interface comparable
	{
		//return this.edad-otro.edad; 					//por edad
		//return this.nombre.compareTo(otro.nombre);	//por edad y nombre
		//primero por edad y despues por nombre
		//(this.edad==otro.edad) ? (this.edad-otro.edad) : (this.nombre.compareTo(otro.nombre));
		if (this.edad==otro.edad)
		{
		return this.nombre.compareTo(otro.nombre);	
		}
		return this.edad-otro.edad;
		
	}

 
}
