import java.util.Scanner;
public class Q1180 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int N = teclado.nextInt();
		int[] X = new int[N];
		int menor = 0;
		int posicao = 0;
		for(int i = 0; i < N; i++) {
			X[i] = teclado.nextInt();
			if(i == 0) {
				menor = X[i];
			}
			if(X[i] < menor) {
				menor = X[i];
				posicao = i; 
			}
			
		}
		System.out.println("Menor valor: "+ menor +"\nPosicao: "+ posicao);
	}

}

