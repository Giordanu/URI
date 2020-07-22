import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;
public class Q1183 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float matriz[][] = new float[12][12];
		String operacao = teclado.next();
		DecimalFormat deci = new DecimalFormat("0.0", new DecimalFormatSymbols(Locale.ENGLISH));
		float soma = 0;
		int cont = 0;
		
		for(int linha = 0; linha < 12; linha++) {
			for(int coluna = 0; coluna < 12; coluna++) {
				matriz[linha][coluna] = teclado.nextFloat();
				if(coluna > linha) {
					soma = soma + matriz[linha][coluna];
					cont++;
				}
			}
		}
		if(operacao.equals("S")){
			System.out.println(deci.format(soma));
		}else if(operacao.equals("M")) {
			float media = soma / cont;
			System.out.println(deci.format(media));
		}
		
		
		
	}

}
