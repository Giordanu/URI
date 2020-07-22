import java.util.Scanner;
public class Q1179 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int X;
		int[] par = new int[5];
		int[] impar = new int[5];
		int indicepar = 0;
		int indiceimpar = 0;
		for (int i = 0; i < 15; i++) {
			X = teclado.nextInt();
			if (X % 2 == 0) {
				par[indicepar] = X;
				indicepar++;
				if (indicepar == 5) {
					imprimeVetor(par, "par", indicepar);
					indicepar = 0;
				}
			} else {
				impar[indiceimpar] = X;
				indiceimpar++;
				if (indiceimpar == 5) {
					imprimeVetor(impar, "impar", indiceimpar);
					indiceimpar = 0;
				}
			}
		}
		imprimeVetor(impar, "impar", indiceimpar);
		imprimeVetor(par, "par", indicepar);
	}
	public static void imprimeVetor(int[] vetor, String nomeDoArray, int indice) {
		for (int i = 0; i < indice; i++) {
			System.out.println(nomeDoArray + "[" + i + "] = " + vetor[i]);
		}
	}
}
