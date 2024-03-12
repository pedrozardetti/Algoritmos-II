package Exercicio03_v2;

import java.util.Scanner;

public class App {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Selecione o curso desejado:");
    System.out.println("1 - Sistemas de Informação (R$ 550,00)");
    System.out.println("2 - Análise e Desenv. Sistemas (R$ 750,00)");
    System.out.println("3 - Ciência da Computação (R$ 1.150,00)");
    System.out.println("4 - Engenharia da Computação (R$ 1.300,00)");
    System.out.println("5 - Engenharia de Software (R$ 950,00)");
    int opcaoCurso = sc.nextInt();

    double valorCurso = mensalidadeCurso(opcaoCurso);

    System.out.println("\nSelecione o programa de bolsa (ou 0 para nenhum):");
    System.out.println("1 - Escola Pública (50%)");
    System.out.println("2 - Bolsista (20%)");
    System.out.println("3 - Ex-aluno (60%)");
    System.out.println("4 - Tutor (100%)");
    System.out.println("0 - Sem bolsa");
    int opcaoBolsa = sc.nextInt();

    double desconto = descontoBolsa(opcaoBolsa);

    String nomeCurso = nomeCurso(opcaoCurso);
    String nomeBolsa = nomeBolsa(opcaoBolsa);
    double valorFinal = calcularMensalidade(valorCurso, desconto);

    System.out.printf("\nVocê escolheu o curso de %s.\n", nomeCurso);

    if (opcaoBolsa != 0) {
      System.out.printf("Você teve %.0f%% de desconto pelo programa de %s.\n", desconto * 100, nomeBolsa);
    }

    System.out.printf("A parcela será R$ %.2f.\n", valorFinal);
  }

  public static double calcularMensalidade(double valorCurso, double desconto) {
    return valorCurso - (valorCurso * desconto);
  }

  public static String nomeCurso(int opcaoCurso) {
    switch (opcaoCurso) {
      case 1:
        return "Sistemas de Informação";
      case 2:
        return "Análise e Desenv. Sistemas";
      case 3:
        return "Ciência da Computação";
      case 4:
        return "Engenharia da Computação";
      case 5:
        return "Engenharia de Software";
      default:
        return "Curso inválido";

    }

  }

  public static double mensalidadeCurso(int opcaoCurso) {
    switch (opcaoCurso) {
      case 1:
        return 550.0;
      case 2:
        return 750.0;
      case 3:
        return 1150.0;
      case 4:
        return 1300.0;
      case 5:
        return 950.0;
      default:
        System.out.println("Opção inválida!");
        return 0.0;
    }
  }

  public static String nomeBolsa(int opcaoBolsa) {
    switch (opcaoBolsa) {
      case 1:
        return "Escola Pública";
      case 2:
        return "Bolsista";
      case 3:
        return "Ex-aluno";
      case 4:
        return "Tutor";
      case 0:
        return "Sem bolsa";
      default:
        System.out.println("Opção inválida!");
        return "";
    }
  }

  public static double descontoBolsa(int opcaoBolsa) {
    switch (opcaoBolsa) {
      case 1:
        return 0.5;
      case 2:
        return 0.2;
      case 3:
        return 0.6;
      case 4:
        return 1.0;
      case 0:
        return 0.0;
      default:
        System.out.println("Opção inválida!");
        return 0.0;
    }
  }
}
