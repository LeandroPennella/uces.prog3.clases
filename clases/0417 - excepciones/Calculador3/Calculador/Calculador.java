package Calculador3.Calculador;
import Calculador3.Exceptions.*;

public class Calculador //Con RuntimeException no precisa aclarar throws
{
		
	public double calcular2()  throws MiException{
		//int[] n = null;
		//int[] n = {2,3,4};ç
		double resultado;
		String[] sn = {"1","s","2"};
		//String[] sn = new String[0];
		//String[] sn=null;
		try{
			resultado=calcularPromedio(sn);
		}
		catch (MiException e){

			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			System.out.println(e.getCause());
			resultado=-300;
			e.printStackTrace();
		}


		catch (Exception e){
			resultado=-400;
			System.out.println("rompio algo");
			//System.err.println("");
			//e.printStackTrace();
		}
		
		
		return resultado;
	}

	public double calcularPromedio(String[] sn) throws MiException {

		if (sn == null) {
			throw new MiException("array vacio");
		}
		double suma=0;


			for (String s : sn){
				try{
					int n=Integer.parseInt(s);
					suma+=n;
				}
				catch (NumberFormatException e )
				{
					throw new MiException("no es numerico",e);
				}
		
		}
				return suma/sn.length;
	}
}
