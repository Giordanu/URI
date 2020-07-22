import java.text.DecimalFormat;
import java.util.Scanner;
public class Q1017 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	DecimalFormat deci = new DecimalFormat("0.000");
	int tempo;
	double velocidade;
	tempo = teclado.nextInt();
	velocidade = teclado.nextDouble();
	double DP = velocidade / 12;
	double litros = DP * tempo;
	System.out.println(deci.format(litros));
	}
}