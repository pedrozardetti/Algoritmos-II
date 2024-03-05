package publico;

import java.util.Scanner;

public class Tela {
  Scanner ler = new Scanner(System.in);
    

    public double pedirNota(String msg) {
        System.out.println(msg);
        System.out.print(">> ");
        double valor = ler.nextDouble();
        return valor;
    }

    public double pedirDouble() {
      return ler.nextDouble();
    }


    public int pedirFaltas(String msg) {
        System.out.println(msg);
        System.out.print(">> ");
        int valor = ler.nextInt();
        return valor;
    }
    public int pedirOpcao(String msg) {
      System.out.println(msg);
      System.out.println("--> ");
      int valor = ler.nextInt();
      return valor;
  
    }
  
    public int pedirDesc(String msg) {
      System.out.println(msg);
      System.out.println("--> ");
      int valor = ler.nextInt();
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
