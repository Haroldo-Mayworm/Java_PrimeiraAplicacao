import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        String nome = "Haroldo Mayworm";
        String contaC = "Corrente";
        String contaP = "Poupança";
        double saldoC = 952.99;
        double saldoP = 0;
        int operacao = 0;

        System.out.println("***********************\n");
        System.out.println("liente: " + nome);
        System.out.println("Conta: " + contaC);
        System.out.println("Saldo atual: " + saldoC);
        System.out.println("Conta: " + contaP);
        System.out.println("Saldo atual: " + saldoP);
        System.out.println("\n***********************");

        String menu = """
        		
                ** Selecione a Operação **
                1 - Consultar saldo
                2 - Transferir para a conta poupança
                3 - Transferir para a conta corrente
                4 - Receber valor 
                5 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (operacao != 5) {
            System.out.println(menu);
            operacao = leitura.nextInt();

            if (operacao == 1){
                System.out.println("O saldo é de " + saldoC + " na conta corrente e de " + saldoP + " na poupança.");
            } else if (operacao == 2) {
                System.out.println("Qual o valor que deseja guardar?");
                double valor = leitura.nextDouble();
                if (valor > saldoC) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                	saldoC -= valor;
                	saldoP += valor;
                    System.out.println("Novo saldo na conta poupança: " + saldoP);
                }
            } else if (operacao == 3) {
                System.out.println("Qual o valor que deseja resgatar?");
                double valor = leitura.nextDouble();
                if (valor > saldoP) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                	saldoP -= valor;
                	saldoC += valor;
                    System.out.println("Novo saldo na conta corrente: " + saldoC);
                }
            } else if (operacao == 4) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldoC += valor;
                System.out.println("Novo saldo: " + saldoC);
            } else if (operacao == 5) {
                System.out.println("Obrigado por acessar sua conta!");
            } else if (operacao != 5) {
                System.out.println("Operação invalida");
            }
        }
    }
}