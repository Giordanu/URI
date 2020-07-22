//Escreva um programa que leia o número de um funcionário,
//seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir,
//mostre o número e o salário do funcionário, com duas casas decimais.
import java.text.DecimalFormat;
import java.util.Scanner;
public class Q1008 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, horas;
		double valor, salario;
		DecimalFormat deci = new DecimalFormat("0.00");
		numero = teclado.nextInt();
		horas = teclado.nextInt();
		valor = teclado.nextDouble();
		salario = valor * horas;
		System.out.println("NUMBER = " +numero+ "\nSALARY = U$ " + deci.format(salario));
	}
}