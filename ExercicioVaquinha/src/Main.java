import java.util.Scanner;

public class Main {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws Exception {

    Vaquinha vaq = new Vaquinha();

    System.out.println("Objetivo da Vaquinha: ");
    vaq.objetivo = sc.nextLine();

    System.out.println("Meta da Vaquinha: ");
    vaq.meta = sc.nextDouble();

    int opcao = 0;
    do {
      System.out.println("\nMENU");
      System.out.println("1. Doar");
      System.out.println("2. Analisar");
      System.out.println("0. Sair");
      opcao = sc.nextInt();

      switch (opcao) {
        case 1:
          System.out.println("Valor da doação: ");
          double v = sc.nextDouble();

          vaq.doar(v);
          break;

        case 2:
          vaq.analisar();
          break;
      }
    } while (opcao != 0);

  }
}