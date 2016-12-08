package clases;

import java.util.Random;

public class Productor extends Thread {

	private Recurso recurso;
	private Random random = new Random();

	public Productor(Recurso recurso) {
		this.recurso=recurso;

	}

	@Override
	public void run() {
		Random tiempo = new Random();
		try {
			while (true) {
				synchronized (recurso) {	
					if (recurso.getContador() <4) {
						recurso.notify();
						recurso.getBuffer()[recurso.getContador()]=producir();
						recurso.setContador(recurso.getContador()+1);
						
					} else {
						recurso.wait();
					}
				}
				 Thread.sleep(tiempo.nextInt(150) + 100);
			}
		} catch (InterruptedException e) {
			System.out.println("Productor interrumpido");
		}
	}

	public String producir() {
		
		String posibles = "abcdefhijklmnopqrstuvwxyz";
		String cadena="" + 
				posibles.charAt(random.nextInt(posibles.length()))+
				posibles.charAt(random.nextInt(posibles.length()))+"-"
				;
		System.out.println("produce >" + cadena);
		return cadena;
	}
}
