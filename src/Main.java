public class Main {
	public static void main(String[] args) {
		System.out.println("Stream Match");
		
		System.out.println("Top Gun: Maverick");
		
		int anoDeLancamento = 2022;
		System.out.println((anoDeLancamento > 0) ? anoDeLancamento : "Ano de lançamento não cadastrado!");
		
		boolean incluidoNoPlano = true;
		System.out.println((incluidoNoPlano == true) ? "Incluso no Plano!" : "Não incluso no Plano");
		
		double notaDoFilme = 8.1;
		System.out.println((notaDoFilme > 7) ? notaDoFilme + " - É um bom filme!" : notaDoFilme + " - Não é um bom filme!");
	}
}