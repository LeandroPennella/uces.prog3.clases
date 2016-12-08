package objectStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import deudor.Deudor;

public class Serializador {
	public static void main(String[] args) {
		List<Deudor> deudores = new ArrayList<Deudor>();
		deudores.add(new Deudor("pepe", 22, 12));
		deudores.add(new Deudor("pepa", 23, 13));
		deudores.add(new Deudor("pepi", 24, 14));
	}

	public void persistirDeudores(List<Deudor> deudores, String path) {
		ObjectOutputStream escritor = null;
		try {
			escritor = new ObjectOutputStream(new BufferedOutputStream(
					new FileOutputStream("bddeudores.dat")));
			for (Deudor deudor : deudores) {
				escritor.writeObject(deudor);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no enontrado");
		} catch (IOException e) {
			System.out.println("Error general de IO");
		} 
		finally {
			if (escritor != null) {
				try {
					escritor.flush();
					escritor.close();
				} catch (IOException e) {	
					System.out.println("no se pudo cerrar");
					// e.printStackTrace();
				}
			}
		}
	}
}
