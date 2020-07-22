import java.text.DecimalFormat;
import java.util.Scanner;
public class Q1015 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		DecimalFormat deci = new DecimalFormat("0.0000");
		double x1, y1, x2, y2, f1, f2;
		x1 = teclado.nextDouble();
		y1 = teclado.nextDouble();
		x2 = teclado.nextDouble();
		y2 = teclado.nextDouble();
		f1 = (x2 - x1) * (x2 - x1);
		f2 = (y2 - y1) * (y2 - y1);
		double f3 = Math.sqrt(f1 + f2);
		System.out.println(deci.format(f3));
	}

}
