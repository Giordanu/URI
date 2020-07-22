import java.util.Scanner;
import java.text.DecimalFormat;
public class Q1010 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cod1, cod2, num1, num2;
		double valor1, valor2, valor01, valor02;
		DecimalFormat deci = new DecimalFormat ("0.00");
		cod1 = teclado.nextInt();
		num1 = teclado.nextInt();
		valor1 = teclado.nextDouble();
		cod2 = teclado.nextInt();
		num2 = teclado.nextInt();
		valor2 = teclado.nextDouble();
		valor01 = valor1 * num1;
		valor02 = valor2 * num2;
		double soma = valor01 + valor02;
		System.out.println("VALOR A PAGAR: R$ " + deci.format(soma));
	}

}
