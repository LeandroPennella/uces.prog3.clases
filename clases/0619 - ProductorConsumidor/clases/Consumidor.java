package clases;

import java.util.Random;

public class Consumidor extends Thread {

	private Recurso recurso;


	public Consumidor(Recurso recurso) {
		this.recurso=recurso;

	}

	@Override
	public void run() {
		Random tiempo = new Random();
		try {
			while (true) {
				synchronized (recurso) {
					if (recurso.getContador() > 0) {
						recurso.notify();
						consumir(recurso.getBuffer()[recurso.getContador()-1]);
						recurso.setContador(recurso.getContador()-1);
					} else {
						recurso.wait();
					}
				}
				Thread.sleep(tiempo.nextInt(150) + 100);
			}

		} catch (InterruptedException e) {
			System.out.println("consumidor interrumpido");
		}

	}

	public void consumir(String cadena) {
		System.out.println("consume >"+ cadena);
		;
	}
}
