package clases;

public class Recurso {
	private int contador=0;
	private String[] buffer=new String[4];
	
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public String[] getBuffer() {
		return buffer;
	}
	public void setBuffer(String[] buffer) {
		this.buffer = buffer;
	}
}
