package jaulas;

import animales.Animal;
import animales.Faisan;

public class JaulaFaisan extends Jaula {
	public Animal crear(){
		return new Faisan();
	}
}