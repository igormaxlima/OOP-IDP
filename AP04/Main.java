import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Olá! Seja Bem-Vindo(a) ao nosso estacionamento.");
            System.out.println(" ");

            System.out.println("1. Deseja adicionar um novo veículo.");
            System.out.println("2. Encerrar");
            System.out.print(": ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Estacionamento.estacionarVeiculo();
                    break;
                case 2:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
