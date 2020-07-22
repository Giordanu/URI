import java.util.Scanner;

public class Q1174 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] A = new double[100];
		for (int i = 0; i < 100; i++) {
			A[i] = teclado.nextDouble();
			if (A[i] <= 10) {
				System.out.println("A[" + i + "] = " + A[i]);
			}

//		for (int i = 0; i < 4; i++) {
//			if (A[i] <= 10) {
//				System.out.println("A[" + i + "] = " + A[i]);
//			}
//
//		}
		}
	}
}
