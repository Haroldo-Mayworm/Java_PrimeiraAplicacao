import java.util.Scanner;

public class LoopWhile {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		double mediaNotas = 0;
		double nota = 0;
		int i = 0;
		
		while (nota != -1) {
			System.out.println("Digite suas notas e -1 para finalizar!");
			nota = leitura.nextDouble();
			if (nota != -1) {
				mediaNotas += nota;
				i++;
			}
		}
		
		System.out.println("A média das suas notas é " + mediaNotas / i);
	}
}