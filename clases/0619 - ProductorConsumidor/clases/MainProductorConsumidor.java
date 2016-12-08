package clases;

public class MainProductorConsumidor {
	public static void main(String[] args)
	{
		Recurso recurso=new Recurso();
		Thread productor=new Productor(recurso);
		Thread consumidor=new Consumidor(recurso);
		productor.start();
		consumidor.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		productor.interrupt();
		consumidor.interrupt();
		
			
		
	}
}
