package ListarDirectorio;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Comparator.PersonaComparatorEdadDescNombre;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostrarContenido("c:/");
	}
	public static void mostrarContenido(String carpeta)
	{
		File file=new File(carpeta);
		if (!file.exists()){
			System.out.println("no existe");}
		else if(!file.isDirectory()){
			System.out.println("no es directorio");}
		else{
			
			List<File>archivos=new ArrayList<File>();
			//List<File>directorios=new ArrayList<File>();
			for(File f:file.listFiles())
			{		
				archivos.add(f);				
			}
			
			Collections.sort(archivos, new ComparadorArchivos());
			
			for(File f:archivos)
			{System.out.println(((f.isDirectory())?"+":(f.isFile())?"-":"*")+" "+f.getName());}
		}
	}
}

class ComparadorArchivos implements Comparator<File>
{
	@Override
	public int compare(File o1, File o2) {
		// TODO Auto-generated method stub
		int resultado=0;
		if (o1.isDirectory()&&o2.isFile())
		{resultado=-1;}
		if (o1.isDirectory()&&o2.isDirectory())
		{resultado=o1.compareTo(o2);}
		if (o1.isFile()&&o2.isFile())
		{resultado=o1.compareTo(o2);}
		if (o1.isFile()&&o2.isDirectory())
		{resultado=1;}
		return resultado;	
	}
}
