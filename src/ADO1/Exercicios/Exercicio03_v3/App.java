package Exercicio03_v3;

import java.util.Scanner;

public class App {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    Universidade uni = new Universidade();

    System.out.println("Selecione o curso desejado:");
    System.out.println("1 - Sistemas de Informação (R$ 550,00)");
    System.out.println("2 - Análise e Desenv. Sistemas (R$ 750,00)");
    System.out.println("3 - Ciência da Computação (R$ 1.150,00)");
    System.out.println("4 - Engenharia da Computação (R$ 1.300,00)");
    System.out.println("5 - Engenharia de Software (R$ 950,00)");
    int opcaoCurso = sc.nextInt();

    double valorCurso = uni.mensalidadeCurso(opcaoCurso);

    System.out.println("\nSelecione o programa de bolsa (ou 0 para nenhum):");
    System.out.println("1 - Escola Pública (50%)");
    System.out.println("2 - Bolsista (20%)");
    System.out.println("3 - Ex-aluno (60%)");
    System.out.println("4 - Tutor (100%)");
    System.out.println("0 - Sem bolsa");
    int opcaoBolsa = sc.nextInt();

    double desconto = uni.descontoBolsa(opcaoBolsa);

    String nomeCurso = uni.nomeCurso(opcaoCurso);
    String nomeBolsa = uni.nomeBolsa(opcaoBolsa);
    double valorFinal = uni.calcularMensalidade(valorCurso, desconto);

    System.out.printf("\nVocê escolheu o curso de %s.\n", nomeCurso);

    if (opcaoBolsa != 0) {
      System.out.printf("Você teve %.0f%% de desconto pelo programa de %s.\n", desconto * 100, nomeBolsa);
    }

    System.out.printf("A parcela será R$ %.2f.\n", valorFinal);

  }
}
