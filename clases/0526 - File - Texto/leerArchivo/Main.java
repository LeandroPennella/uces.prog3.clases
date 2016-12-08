package leerArchivo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leer("c:/sarasa.txt");	
	}
	
	public static void leer (String path) 
	{
		System.out.println("> leyendo " + path);
		Reader r=null;
		try{
			r=new FileReader(path);
			int aux=r.read();
			while(aux!=-1){
				System.out.print((char)aux);
				aux=r.read();
			}
		} catch (FileNotFoundException e){
			System.out.println("No existe el archivo "+ path);
		} catch (IOException e){
			System.out.println("No pude cerrar el archivo "+ path);}

		finally{
			try{
				r.close();
				System.out.println("\n> termino");
			} catch(IOException e){
					System.out.println("no pude cerrar "+path);
			}
		}
	}
}
