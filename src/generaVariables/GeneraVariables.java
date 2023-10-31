package generaVariables;

import java.util.Random;

public class GeneraVariables {
	static String letras() {
		Random aleatorio = new Random();
		char letra = (char) (aleatorio.nextInt(26) + 'a');
		return String.valueOf(letra);
	}

	static int numero() {
		Random aleatorio = new Random();
		return aleatorio.nextInt(1000);
	}

	public static void main(String[] args) {
		String variable = letras() + numero();
		System.out.println("La variable es " + variable);
	}
}