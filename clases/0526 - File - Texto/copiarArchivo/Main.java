package copiarArchivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String origen="C:/Users/Alumno/ori.txt";
		String destino="C:/Users/Alumno/desti.txt";
		copiar(origen, destino);
	}
	
	public static void copiar(String origen, String destino){
		System.out.println("> copiando :");
		long inicio=System.currentTimeMillis();
		Reader r=null;
		Writer w=null;
		try{
				
				w= new BufferedWriter(new FileWriter(destino));
				r= new BufferedReader(new FileReader(origen));
				int i = r.read();
				while (i != -1) {
					w.write(i);
					i = r.read();
				}
				w.flush();
				long fin=System.currentTimeMillis();
				System.out.println("> Archivo copiado en "+ (fin-inicio) + " ms");
				
		} catch (FileNotFoundException e) {
			if (r==null)
			{System.out.println("no se pudo abrir origen");}
			else
			{System.out.println("no se pudo abrir destino");}
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error :" + e.getMessage());
			e.printStackTrace();
		} finally {
			if (r!=null) {
				try {
					r.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("no se pudo cerrar origen");
					e.printStackTrace();
				}
			}
			if (w!=null) {
				try {
					r.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("no se pudo cerrar destino");
					e.printStackTrace();
				}
			}
		}
	}

}
