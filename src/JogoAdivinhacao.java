import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int numAleatorio = new Random().nextInt(100);
		int numTentativa = 0;
		int tentativas = 0;
		
		while (tentativas < 5) {
			System.out.println("Tente acertar o numero entre 0 e 100:");
			numTentativa = leitura.nextInt();
			tentativas++;
			
			if (numAleatorio == numTentativa) {
				System.out.println("Parabéns você acertou o numero!");
				break;
			} else if (numTentativa < numAleatorio) {
                System.out.println("O número digitado é menor que o número que deve ser adivinhado.");
            } else {
                System.out.println("O número digitado é maior que o número que deve ser adivinhado.");
            }
			
			if (tentativas == 5) {
	            System.out.println("Você perdeu o jogo, o numero era " + numAleatorio);
	        }
		}
	}
}