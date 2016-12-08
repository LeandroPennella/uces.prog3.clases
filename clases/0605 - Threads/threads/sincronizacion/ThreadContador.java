package threads.sincronizacion;

public class ThreadContador extends Thread {
	Contador contadorInterno;
	boolean sumar;

	public ThreadContador(Contador contador, boolean sumar) {
		this.contadorInterno = contador;
		this.sumar = sumar;
	}

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			if (this.sumar) {
				//synchronized (contadorInterno) {
					contadorInterno.incrementar();
				//}
			} else {
				//synchronized (contadorInterno) {
					contadorInterno.decrementar();
				//}
			}
		}
	}

}
