package threads.sincronizacion;

import java.util.ArrayList;
import java.util.List;

import thread.MiThread;

public class MainContador {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Contador contador = new Contador();
		List<ThreadContador> threads = new ArrayList<ThreadContador>();
		
		for (int i = 0; i < 10; i++) {
			threads.add(new ThreadContador(contador, (i<5)?true:false));
		}
		
		for (ThreadContador thread : threads) {
			thread.start();
		}
		
		for (ThreadContador thread : threads) {
			thread.join();
		}
		
		System.out.println("valor :" + contador.getValor());
	}
}
