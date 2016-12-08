package thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadsPrograma {
	public static void main(String[] args) throws InterruptedException {

		List<MiThread> threads = new ArrayList<MiThread>();
		Thread threadMain=Thread.currentThread();
		
		for (int i = 0; i < 10; i++) {
			threads.add(new MiThread(i));
		}
		
		for (Thread thread : threads) {
			thread.start();
		}
		
		Thread.sleep(100);//sino trata de interrumpitr algo qe aun no empezo a ejecutarse
		for (Thread thread : threads) {
			//thread.join();
			thread.interrupt();
		}
		
		System.out.println("termino el main");
	}
}
