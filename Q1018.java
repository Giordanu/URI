import java.util.Scanner;
public class Q1018 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int X, C100 = 0, C50 = 0, C20 = 0, C10 = 0, C5 = 0, C2 = 0, C1 = 0;
		X = teclado.nextInt();
		int Y = X;
		while(X >= 100) {
			C100++;
			X = X - 100;
		}
		while(X >= 50) {
			C50++;
			X = X - 50;
		}
		while(X >= 20) {
			C20++;
			X = X - 20;
		}
		while(X >= 10) {
			C10++;
			X = X - 10;
		}
		while(X >= 5) {
			C5++;
			X = X - 5;
		}
		while(X >= 2) {
			C2++;
			X = X - 2;
		}
		while(X >= 1) {
			C1++;
			X = X - 1;
		}
		System.out.println(Y+"\n" + C100 + " nota(s) de R$ 100,00\n" + C50 + " nota(s)"
				+ " de R$ 50,00\n"+ C20 + " nota(s) de R$ 20,00\n" + C10 + " nota(s)"
						+ " de R$ 10,00\n" + C5 + " nota(s) de R$ 5,00\n" + C2 + ""
								+ " nota(s) de R$ 2,00\n" + C1 + " nota(s) de R$ 1,00");
	}

}
