import java.util.Scanner;

public class Q1238 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int maior, menor;
		String maiorzona;
		for (int x = 0; x < N; x++) {
			String p1 = in.next();
			String p2 = in.next();
			String p3 = "";
			if (p1.length() > p2.length()) {
				maior = p1.length();
				menor = p2.length();
				maiorzona = p1;
			} else {
				menor = p1.length();
				maior = p2.length();
				maiorzona = p2;

			}
			for (int i = 0; i < maior; i++) {
				if (i < menor) {
					p3 = p3 + p1.charAt(i) + p2.charAt(i);

				}else {
					
					p3 = p3 + maiorzona.charAt(i);
				}
			}
			System.out.println(p3);


		}
	}
}
