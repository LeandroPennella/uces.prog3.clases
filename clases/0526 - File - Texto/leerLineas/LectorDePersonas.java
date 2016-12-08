package leerLineas;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorDePersonas {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		List<Persona> personas = leerPersonas("personas.csv");
		for (Persona p : personas) {
			System.out.println(p.toString());
		}
	}

	public static List<Persona> leerPersonas(String origen)  {
		BufferedReader r = null;

		List<Persona> personas=new ArrayList<Persona>();
		try {
			personas = new ArrayList<Persona>();
			r = new BufferedReader(new FileReader(origen));
			String linea = r.readLine();
			while (linea != null) {
				personas.add(new Persona(linea));
				linea = r.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("error generico io"); //e.printStackTrace();
		}
		
		finally {
			if (r!=null)
			{
				try {
					r.close();
				} catch (IOException e) {
					System.out.println("no se puede cerrar");
				}
			}
		}
		return personas;

	}

}
