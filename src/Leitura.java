import java.util.Scanner;

public class Leitura {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Qual seu jogo favorito?");
		String filme = leitura.nextLine();
		System.out.println("Quando o jogo foi lançado?");
		int lancamento = leitura.nextInt();
		System.out.println("Qual sua avaliaç'o do jogo? (1-10)");
		double avaliacao = leitura.nextDouble();
		System.out.println(String.format("%s, %d, %.1f", filme, lancamento, avaliacao));
	}
}