import java.util.Scanner;

public class QCWI {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String entrada = teclado.next();
		System.out.println(validaComplexidade(entrada));
		
	}

	public static int validaComplexidade(String valor) {
		boolean digito = false;
		boolean minusculo = false;
		boolean maiusculo = false;
		if (valor.length() >= 8 && valor.length() <= 32) {
			for (int i = 0; i < valor.length(); i++) {
				char variavel = valor.charAt(i);
				if (Character.isDigit(variavel)) {
					digito = true;

				} else if (Character.isUpperCase(variavel)) {
					maiusculo = true;
				} else if (Character.isLowerCase(variavel)) {
					minusculo = true;
				} else {
					return 0;
				}

			}
			if (digito && minusculo && maiusculo) {
				return 1;
			}
		}
		return 0;
	}
}
