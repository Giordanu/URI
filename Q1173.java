import java.util.Scanner;
public class Q1173 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int[] N = new int[10];
		N[0] = teclado.nextInt();
		for(int i = 0; i < N.length; i++) { // caso nao saiba valor maximo é .length
		if(i != 0) {
			N[i] = N[i-1] * 2;
	
		}
		System.out.println("N["+i+"] = "+N[i]);
		}
		}
	}

