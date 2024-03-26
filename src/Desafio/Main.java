import java.util.Scanner;

public class Main {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int opcao = 0;
    double valor;

    ContaCorrente conta = new ContaCorrente();

    do {
      opcao = menu();

      if (opcao == 1) {
        System.out.println("Quanto você gostaria de depositar?");
        valor = sc.nextDouble();
        conta.depositar(valor);
        System.out.println("O seu saldo atual após este novo depósito é de R$" + conta.verSaldo());
      } else if (opcao == 2) {
        System.out.println("Quanto você gostaria de sacar?");
        valor = sc.nextDouble();
        conta.sacar(valor);
        System.out.println("O seu saldo atual após este novo saque é de R$" + conta.verSaldo());
      } else if (opcao == 3) {
        System.out.println("Exibindo o saldo! --> R$" + conta.verSaldo());
      }
    } while (opcao != 0);
    System.out.println("PROGRAMA ENCERRADO :)");

  }

  public static int menu() {
    System.out.println("1. Depositar");
    System.out.println("2. Sacar");
    System.out.println("3. Ver Saldo");
    System.out.println("0. Sair");

    return sc.nextInt();
  }
}