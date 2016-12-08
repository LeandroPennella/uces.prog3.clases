package Calculador2;

public class Calculador //Con RuntimeException no precisa aclarar throws
{
	
	public double calcular3()
	{
		double resultado=0;
		
		try{
			resultado=calcular2();
		}
		
		catch (RuntimeException rte){
			System.out.println("opa! rte " + rte.getMessage());
			rte.printStackTrace(System.out);
			rte.printStackTrace();
			resultado=0;
			
		}
		
		catch (Exception e){
			System.out.println("opa!" + e.getMessage());
			e.printStackTrace(System.out);
			e.printStackTrace();
			resultado=0;
		}
		
		
		return resultado;
	}
	
	public double calcular2()  {
		int[] n = null;
		//int[] n = {2,3,4};
		return calcularPromedio(n);
	}

	public double calcularPromedio(int[] n)  {

		if (n == null) {
			throw new RuntimeException("array vacio");
		}
		int suma=0;
		for (int j : n){
			suma+=j;
		}
		
		return suma/n.length;
	}
}
