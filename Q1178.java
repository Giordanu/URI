import java.text.DecimalFormat;
import java.util.Scanner;

public class Q1178 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.0000");
		double[] N = new double[10];
		N[0] = teclado.nextDouble();
		for (int i = 0; i < N.length; i++) {
			if (i > 0) {
				N[i] = (N[i - 1]) / 2;
			}
			System.out.println("N[" + i + "] = " + deci.format(N[i]));
		}
	}
}
