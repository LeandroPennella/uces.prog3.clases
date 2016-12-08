package CopiarBinario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStream is = new FileInputStream(
				"C:/Users/Alumno/workspace/clases/clase0522 - File/IOFile/clase0522.rar");
		OutputStream os = new FileOutputStream(
				"C:/Users/Alumno/workspace/clases/clase0522 - File/IOFile/destino.rar");
		int i = is.read();
		while (i != -1) {
			os.write(i);
			i = is.read();
		}
		is.close();
		os.close();
	}

}
