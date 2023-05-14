public class Main {
	public static void Main(String[] args) {
		// Variáveis String
		String plataforma = "Stream Match";
		System.out.println(plataforma);
		
		String nomeFilme = "Top Gun: Maverick0";
		System.out.println(nomeFilme);
		
		String sinopse = """
					filme de aventura,
					com ator dos anos 80!!!""";
		System.out.println(sinopse);
		
		// Variáveis int, boolean e double
		int anoDeLancamento = 2022;
		System.out.println((anoDeLancamento > 0) ? anoDeLancamento : "Ano de lançamento não cadastrado!");
		
		boolean incluidoNoPlano = true;
		System.out.println((incluidoNoPlano == true) ? "Incluso no Plano!" : "Não incluso no Plano");
		
		double notaDoFilme = 8.1;
		System.out.println((notaDoFilme > 7) ? notaDoFilme + " - É um bom filme!" : notaDoFilme + " - Não é um bom filme!");
		
		// Acrescentando valores na variável 
		int i = 10;
		System.out.println(i);
		i += 19;
		System.out.println(i);
		i -= 10;
		System.out.println(i);
		
		// Operação com variáveis
		double media = (9.3 + 4.8 + 5.9) / 3;
		System.out.println(media); 
		
		// format
		String nome = "Haroldo";
		int idade = 21;
		double mediaNota = (8.5 + 9.2 + 7.5) / 3;
		System.out.println(String.format("Meu nome é %s, tenho %d anos e a média das minhas notas é %.1f", nome, idade, media));
		
		// Cast explícito
		double valor = (2.5 + 4.7 + 9 + 1.1);
		int numInteiro = (int) valor;
		System.out.println(numInteiro);
		
		// Cast implícito
		int x = 5;
		short y = 4;
		System.out.println(x + y);
		
		// Exercício - Converta temperatura em graus Celsius para Fahrenheit
		double tempCelsius = 30;
		double tempFahrenheit = (tempCelsius * 1.8) + 32;
		String conversao = String.format("A temperatuda de %.1f Celsius, equivale a %.1f Fahrenheit!", tempCelsius,tempFahrenheit);
		System.out.println(conversao);
	}
}