package dataStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import deudor.*;


public class Escritor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		List<Deudor>deudores=new ArrayList<Deudor>();
		deudores.add(new Deudor("pepe",22,12));
		deudores.add(new Deudor("pepa",23,13));
		deudores.add(new Deudor("pepi",24,14));
		
		DataOutputStream escritor=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("deudores.dat")));
		for(Deudor deudor:deudores)
		{
			escritor.writeUTF(deudor.getNombre());
			escritor.writeInt(deudor.getEdad());
			escritor.writeDouble(deudor.getSaldo());
		}
		escritor.flush();
		escritor.close();
	}

}
