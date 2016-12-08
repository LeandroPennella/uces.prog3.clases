package excepciones;

public class Calculador {//Exception> chequeada por el compilador > pide throws
	
	public double calcular3()
	{
		double resultado=0;
		
		try{
			resultado=calcular2();
		}
		
		catch (Exception e){
			System.out.println("opa!" + e.getMessage());
			e.printStackTrace(System.out);
			e.printStackTrace();
			resultado=0;
		}
		
		
		return resultado;
	}
	
	public double calcular2() throws Exception {
		int[] n = null;
		//int[] n = {2,3,4};
		return calcularPromedio(n);
	}

	public double calcularPromedio(int[] n) throws Exception {

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


