import java.util.Arrays;
import java.util.Scanner;

public class Q1581 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		String tanana = "ingles";
		for (int i = 0; i < N; i++) {
			int numpessoa = teclado.nextInt();
			String pessoa[] = new String[numpessoa];
			for (int j = 0; j < numpessoa; j++) {
				pessoa[j] = teclado.next();
			}
			for (int j = 0; j < numpessoa - 1; j++) {
				if (pessoa[j].equals(pessoa[j + 1])) {
					tanana = pessoa[j];
				} else {
					tanana = "ingles";
					break;
				}
				
			}
			System.out.println(tanana);
		}
	}
}
