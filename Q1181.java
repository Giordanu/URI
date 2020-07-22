import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;
public class Q1181 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float matriz[][] = new float[12][12];
		float soma = 0;
		int L;
		DecimalFormat deci = new DecimalFormat(".0", new DecimalFormatSymbols(Locale.ENGLISH));
		String operacao;
		L = teclado.nextInt();
		operacao = teclado.next();
		for(int linha = 0; linha < 12; linha++ ) {
			for(int coluna = 0; coluna < 12; coluna++) {
				matriz[linha][coluna] = teclado.nextFloat();
				if(linha == L) {
					soma = soma + matriz[linha][coluna];
				}
			}
		}
		
		if(operacao.equals("S")) {
			System.out.println(deci.format(soma));
		}else if(operacao.equals("M")){
			float media = soma / 12 ;
			System.out.println(deci.format(media));
		}
		
	}

}
