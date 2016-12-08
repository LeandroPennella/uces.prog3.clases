package jaulas;

import animales.Animal;
import animales.Tigre;

public class JaulaTigre extends Jaula {
	public Animal crear(){
		return new Tigre();
	}
}
