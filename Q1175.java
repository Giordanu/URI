import java.util.Scanner;
public class Q1175 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] N = new int[20];
		int[] M = new int[20];
		int X = 19;
		for(int i = 0; i < 20; i++) {
			N[i] = teclado.nextInt();
			M[i] = N[i];
		}
		for(int i = 0; i < 20; i++) {
			N[i] = M[X];
			X--;
			System.out.println("N["+i+"] = "+ N[i]);
		}
	}
}
//0 19     
//1 18	   
//2 17     
//3 16	   
//4 15  
//5 14
//6 13
//7 12
//8 11
//9 10



