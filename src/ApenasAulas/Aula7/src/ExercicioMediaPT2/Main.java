package ExercicioMediaPT2;

import java.util.Scanner;

public class Main {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    MediaAluno mediaAluno = new MediaAluno();

    System.out.println("Qual o nome do aluno?");
    String nome = sc.nextLine();

    int opcao = 0;

    do {
      System.out.println("\nBEM-VINDO AO MENU DE MÉDIA");
      System.out.println("1. Nova Nota");
      System.out.println("2. Nova Falta");
      System.out.println("3. Analisar");
      System.out.println("0. Sair");
      opcao = sc.nextInt();

      switch (opcao) {
        case 1:
          System.out.println("Insira a nova nota: ");
          double n = sc.nextDouble();
          mediaAluno.novaNota(n);
          break;

        case 2:
          System.out.println("Insira a nova falta: ");
          int falta = sc.nextInt();
        case 3:
          double m = mediaAluno.media();
          String s = mediaAluno.situacao();
          System.out.println("A média do aluno é --> " + m);
          System.out.println("A situação do aluno é --> " + s);
          break;
      }
    } while (opcao != 0);
    System.out.println("O PROGRAMA FOI FINALIZADO :)");

  }
}

