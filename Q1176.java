import java.util.Scanner;

public class Q1176 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// 0 1 1 2 3 5 8 13 21 34 55 89
		int T = teclado.nextInt();
		long[] fibonacci = new long[61];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		int indice;
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]);
		}
		for (int i = 0; i < T; i++) {
			indice = teclado.nextInt();
			System.out.println("Fib(" + indice + ") = " + fibonacci[indice]);
		}
	}
}
