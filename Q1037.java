import java.util.Scanner;
public class Q1037 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double X = teclado.nextDouble();
		if(X >=0 && X <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		if(X > 25 && X <=50) {
			System.out.println("Intervalo (25,50]");
		}
		if(X > 50 && X <=75) {
			System.out.println("Intervalo (50,75]");
		}
		if(X > 75 && X <=100) {
			System.out.println("Intervalo (75,100]");
		}
		if(X < 0 || X > 100) {
			System.out.println("Fora de intervalo");
		}
	}
}
