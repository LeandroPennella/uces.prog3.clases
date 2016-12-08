package objectStream;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import deudor.Deudor;

public class DeSerializador {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		List<Deudor> deudores = new ArrayList<Deudor>();
		ObjectInputStream lector = new ObjectInputStream(new BufferedInputStream(new FileInputStream("bddeudores.dat")));
		try {
			while (true) {
				Deudor deudor=(Deudor)lector.readObject();
				deudores.add(deudor);
			}
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		} finally {
			lector.close();
			for (Deudor deudor : deudores) {
				System.out.println(deudor.toString());
			}
		}
		
	}

}
