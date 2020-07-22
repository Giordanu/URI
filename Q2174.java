import java.util.Arrays;
import java.util.Scanner;

public class Q2174 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int qntdPokemon = teclado.nextInt();
		int cont = 151;
		int repeat;
		String[] pokemon = new String[qntdPokemon];

		for (int i = 0; i < qntdPokemon; i++) {
			pokemon[i] = teclado.next();
		}
		for (int i = 0; i < qntdPokemon; i++) {
			Arrays.sort(pokemon);
			if (i == 0) {
				cont--;
			} else if (!pokemon[i].equalsIgnoreCase(pokemon[i - 1])) {
				cont = cont - 1;
			}

		}
		System.out.println("Falta(m) " + cont + " pomekon(s).");
	}
}
