import java.util.Scanner;
public class Q1177 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int T = teclado.nextInt();
		int S = 0;
		int[] N = new int[10];
		for (int i = 0; i < N.length; i++) {
			if (S < T) {
				N[i] = S;
				S++;
			} else {
				S = 0;
				N[i] = S;
				S++;
			}
			System.out.println("N[" + i + "] = " + N[i]);

		}

	}
}
