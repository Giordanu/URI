import java.text.DecimalFormat;
import java.util.Scanner;
public class Q1012 {
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		double A, B, C;
		double TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;
		DecimalFormat deci = new DecimalFormat("0.000");
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();
		TRIANGULO = (A * C)/2;
		CIRCULO = 3.14159 * (C * C);
		TRAPEZIO = ((A + B) * C) / 2;
		QUADRADO = (B * B);
		RETANGULO = A * B;
		System.out.println("TRIANGULO: "+ deci.format(TRIANGULO)
		+"\nCIRCULO: "+ deci.format(CIRCULO) +"\nTRAPEZIO: "+ deci.format(TRAPEZIO)
		+"\nQUADRADO: "+deci.format(QUADRADO) + "\nRETANGULO: " + deci.format(RETANGULO));
	}

}
