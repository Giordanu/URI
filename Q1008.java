//Escreva um programa que leia o n�mero de um funcion�rio,
//seu n�mero de horas trabalhadas, o valor que recebe por
//hora e calcula o sal�rio desse funcion�rio. A seguir,
//mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.
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