public class Condicional {
	public static void main(String[] args) {
		int anoLancamento = 2022;
		boolean inclusoNoPlano = false;
		double nota = 9.3;
		String tipoConta = "plus";

		if (anoLancamento >= 2022) {
			System.out.println("Este filme é um lançamento recente!");
		} else {
			System.out.println("Filme antigo!");
		}
		
		if (inclusoNoPlano == true || tipoConta.equals("plus")) {
			System.out.println("Filme liberado!");
		} else {
			System.out.println("Para assistir o filme, assine o plano ou faça o update da sua conta!");
		}
		
		if (nota > 8 && tipoConta.equals("plus")) {
			System.out.println("Filme recomendado para você");
		}
		
		int dia = 3;
		String nomeDia;

		switch (dia) {
		   case 1:
		      nomeDia = "domingo";
		      break;
		   case 2:
		      nomeDia = "segunda-feira";
		      break;
		   case 3:
		      nomeDia = "terça-feira";
		      break;
		   case 4:
		      nomeDia = "quarta-feira";
		      break;
		   case 5:
		      nomeDia = "quinta-feira";
		      break;
		   case 6:
		      nomeDia = "sexta-feira";
		      break;
		   case 7:
		      nomeDia = "sábado";
		      break;
		   default:
		      nomeDia = "Dia inválido";
		      break;
		}
		System.out.println("O dia " + dia + " é " + nomeDia);
	}
}