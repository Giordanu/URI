import java.util.Scanner;
public class Q1041 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double X = teclado.nextDouble();
		double Y = teclado.nextDouble();
		String Q = null;
		if(X > 0 && Y > 0) {
			Q = "Q1";
		}
		if(X > 0 && Y < 0) {
			Q = "Q4";
		}
		if(X < 0 && Y > 0) {
			Q = "Q2";
		}
		if(X < 0 && Y < 0) {
			Q = "Q3";
		}
		if(X == 0 && Y == 0) {
			Q = "Origem";
		}
		System.out.println(Q);
	}
}
