import java.util.Scanner;
public class Q1803 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in) ;
		int N = teclado.nextInt();
		String cifra;
		int volta;
	
		for(int i = 0; i < N; i++) {
			cifra = teclado.next();
			volta = teclado.nextInt();
			String codificado = "";
			for(int j = 0; j < cifra.length(); j++) {
				char letra = cifra.charAt(j);
				letra = (char)(letra - volta); 
				if(letra >= 39 && letra <= 64) {
					letra =(char) (letra + 26);
				}
				codificado = codificado.concat(String.valueOf(letra));
			}
			
			System.out.println(codificado);
		}
			
			
			
			
		}
	}


