package dataStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import deudor.Deudor;

public class Lector {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<Deudor> deudores = new ArrayList<Deudor>();
		DataInputStream lector = new DataInputStream(new BufferedInputStream(new FileInputStream("deudores.dat")));
		try {
			while (true) {
				Deudor deudor;
				String nombre = lector.readUTF();
				int edad = lector.readInt();
				double saldo = lector.readDouble();
				deudor = new Deudor(nombre, edad, saldo);
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
