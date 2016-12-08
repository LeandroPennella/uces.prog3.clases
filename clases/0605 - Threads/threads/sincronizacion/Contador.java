package threads.sincronizacion;

public class Contador {

	private int valor = 0;

	public int getValor() {
		return valor;
	}

	public synchronized void incrementar() {

			int aux = valor;
			++aux;
			Thread.yield();
			valor = aux;
		// valor++;
	}

	public synchronized void decrementar() {

			int aux = valor;
			--aux;
			valor = aux;
		// valor--;
	}

}
