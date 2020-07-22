import java.util.Scanner;
public class Q1172 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vet = new int [10];
		for(int i = 0; i <= 9;i++) {
		vet[i] = teclado.nextInt();
		
		if(vet[i] <= 0) {
		vet[i] = 1;	
		
		}
		System.out.println("X[" + i + "] = " + vet[i]);
		}
	}

}
