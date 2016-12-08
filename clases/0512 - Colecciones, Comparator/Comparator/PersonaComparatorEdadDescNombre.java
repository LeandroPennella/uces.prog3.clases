package Comparator;

import java.util.Comparator;

public class PersonaComparatorEdadDescNombre implements Comparator<Persona>
{
	public int compare(Persona p1, Persona p2)
	{
		if (p1.getEdad()==p2.getEdad()){
			return p1.getNombre().compareTo(p2.getNombre());}
		return p2.getEdad()-p1.getEdad();
	}

}
