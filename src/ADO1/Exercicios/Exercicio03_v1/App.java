package Exercicio03_v1;

import java.util.Scanner;

public class App {
  public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String curso = "";
        double preco = 0.0;
        int opcaoCurso = 0;

        System.out.println("Selecione o curso desejado:");
        System.out.println("1 - Sistemas de Informação (R$ 550,00)");
        System.out.println("2 - Análise e Desenv. Sistemas (R$ 750,00)");
        System.out.println("3 - Ciência da Computação (R$ 1.150,00)");
        System.out.println("4 - Engenharia da Computação (R$ 1.300,00)");
        System.out.println("5 - Engenharia de Software (R$ 950,00)");
        opcaoCurso = sc.nextInt();

        switch (opcaoCurso) {
            case 1:
                curso = "Sistemas de Informação";
                preco = 550.0;
                break;
            case 2:
                curso = "Análise e Desenv. Sistemas";
                preco = 750.0;
                break;
            case 3:
                curso = "Ciência da Computação";
                preco = 1150.0;
                break;
            case 4:
                curso = "Engenharia da Computação";
                preco = 1300.0;
                break;
            case 5:
                curso = "Engenharia de Software";
                preco = 950.0;
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        String bolsa = "";
        double desconto = 0.0;
        int opcaoBolsa = 0;

        System.out.println("\nSelecione o programa de bolsa (ou 0 para nenhum):");
        System.out.println("1 - Escola Pública (50%)");
        System.out.println("2 - Bolsista (20%)");
        System.out.println("3 - Ex-aluno (60%)");
        System.out.println("4 - Tutor (100%)");
        System.out.println("0 - Sem bolsa");
        opcaoBolsa = sc.nextInt();

        switch (opcaoBolsa) {
            case 1:
                bolsa = "Escola Pública";
                desconto = 0.5;
                break;
            case 2:
                bolsa = "Bolsista";
                desconto = 0.2;
                break;
            case 3:
                bolsa = "Ex-aluno";
                desconto = 0.6;
                break;
            case 4:
                bolsa = "Tutor";
                desconto = 1.0;
                break;
            case 0:
                bolsa = "Sem bolsa";
                desconto = 0.0;
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        double valorFinal = preco - (preco * desconto);

        System.out.printf("\nVocê escolheu o curso de %s.\n", curso);

        if (opcaoBolsa != 0) {
            System.out.printf("Você teve %.0f%% de desconto pelo programa de %s.\n", desconto * 100, bolsa);
        }

        System.out.printf("A parcela será R$ %.2f.\n", valorFinal);
    }
}

