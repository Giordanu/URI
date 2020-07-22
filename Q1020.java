import java.util.Scanner;
public class Q1020 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int X = teclado.nextInt();
		int anocont=0, mescont=0, diacont=0;
		while(X >= 365) {
			anocont++;
			X = X - 365;
		}
		while(X >= 30) {
			mescont++;
			X = X - 30;
		}
		System.out.println(anocont + " ano(s)\n" + mescont + " mes(es)\n" + X + " dia(s)");
		
	}
}
