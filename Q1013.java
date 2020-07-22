import java.util.Scanner;
public class Q1013 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int A, B, C, maior=0;
		A = teclado.nextInt();
		B = teclado.nextInt();
		C = teclado.nextInt();
		maior = maior(A, B);
		if(maior > C) {
			System.out.println(maior + " eh o maior");
		}else {
			System.out.println(C + " eh o maior");
		}
		
		
		
	}
	public static int maior(int A, int B) {
		return (A + B + Math.abs(A - B)) / 2;
		
	}
	

}
