import java.util.Scanner;

public class LoopFor {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		double mediaAvaliacao = 0;
		double avaliacao = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Qual sua avaliação?");
			avaliacao = leitura.nextDouble();
			mediaAvaliacao += avaliacao;
		}
		System.out.println("A média das avaliações é " + mediaAvaliacao / 3);
	}
}