package thread;

public class MiThread extends Thread {

	private int numero;
	private Thread threadMain;
	public MiThread(int numero)  {
		this.numero = numero;
		this.threadMain=Thread.currentThread();//antes de que se ejecute start es un objeto, no un thread, el thread actual es quien crea este objeto
		//this.threadMain=threadMain;
	}

	@Override
	public void run() {
		try {
			this.threadMain.join();
			for (int i = 0; i < 10; i++) {
				System.out.println("soy el thread n " + this.numero);
				//Thread.yield();//sugiere que siga con otro thread
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("thread "+ this.numero + "interr");
		}
		
	}
}
