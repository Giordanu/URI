import java.util.Scanner;

public class Q2253 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		while(teclado.hasNext()) {
		String entrada = teclado.nextLine();
		System.out.println(validaComplexidade(entrada));
		}
	}

	public static String validaComplexidade(String valor) {
		boolean digito = false;
		boolean minusculo = false;
		boolean maiusculo = false;
		if (valor.length() >= 6 && valor.length() <= 32) {
			for (int i = 0; i < valor.length(); i++) {
				char variavel = valor.charAt(i);
				if (Character.isDigit(variavel)) {
					digito = true;

				} else if (Character.isUpperCase(variavel)) {
					maiusculo = true;
				} else if (Character.isLowerCase(variavel)) {
					minusculo = true;
				} else {
					return "Senha invalida.";
				}

			}
			if (digito && minusculo && maiusculo) {
				return "Senha valida.";
			}
		}
	return "Senha invalida.";
	}
}

