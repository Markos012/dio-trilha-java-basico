import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obter valores do usuário
        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o valor solicitado: ");
        double valorSolicitado = scanner.nextDouble();

        // Lógica de saque
        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        // Imprimir saldo
        System.out.println("Saldo atual: " + saldo);

        // Repetir a execução com novos valores
        System.out.print("Digite o novo saldo inicial: ");
        saldo = scanner.nextDouble();

        System.out.print("Digite o novo valor solicitado: ");
        valorSolicitado = scanner.nextDouble();

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println("Saldo atual: " + saldo);

        // Fechar o scanner
        scanner.close();
    }
}
