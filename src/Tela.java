import java.util.Scanner;

public class Tela {
  Scanner sc = new Scanner(System.in);

  public int pedirOpcao(String msg) {
    System.out.println(msg);
    System.out.println("--> ");
    int valor = sc.nextInt();
    return valor;

  }

  public int pedirDesc(String msg) {
    System.out.println(msg);
    System.out.println("--> ");
    int valor = sc.nextInt();
    return valor;
  }

  public void escrever(String msg) {
    System.out.println(msg);
  }

  public void formatar(String msg, Object... args) {
    System.out.printf(msg, args);
  }

  public void pularLinha(int qtd) {
    for (int i = 0; i < qtd; i++) {
      System.out.println();
    }
  }
}
