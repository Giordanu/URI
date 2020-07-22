import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Q1182 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float matriz[][] = new float[12][12];
		int C = teclado.nextInt();
		DecimalFormat deci = new DecimalFormat(".0", new DecimalFormatSymbols(Locale.ENGLISH));
		float soma = 0;

		String operacao = teclado.next();
		for (int linha = 0; linha <= 11; linha++) {
			for (int coluna = 0; coluna <= 11; coluna++) {
				matriz[linha][coluna] = teclado.nextFloat();
			}
		}
		for (int linha = 0; linha <= 11; linha++) {
			soma = soma + matriz[linha][C];

		}
		float media = soma / 12;
		if (operacao == "S") {
			System.out.println(deci.format(soma));
		} else {
			System.out.println(deci.format(media));
		}

	}
}
