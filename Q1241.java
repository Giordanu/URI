import java.util.Scanner;

public class Q1241 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N;
		String A, B, ultimasLetras;
		N = teclado.nextInt();
		for (int i = 0; i < N; i++) {
			A = teclado.next();
			B = teclado.next();

			if (A.length() >= B.length()) {
				ultimasLetras = A.substring(A.length() - B.length());
				if (ultimasLetras.equals(B)) {
					System.out.println("encaixa");

				} else {
					System.out.println("nao encaixa");
				}
			}else {
				System.out.println("nao encaixa");
			}
		}

	}
}
