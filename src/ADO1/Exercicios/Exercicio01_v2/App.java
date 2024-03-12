package Exercicio01_v2;
import java.util.Scanner;

public class App {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws Exception {

    System.out.println("----- PROGRAMA DE MEDIA -----");
    System.out.println(">> Informe a primeira nota <<");
    double n1 = sc.nextDouble();
    System.out.println(">> Informe a segunda nota");
    double n2 = sc.nextDouble();
    System.out.println(">> Informe a terceira nota <<");
    double n3 = sc.nextDouble();
    System.out.println(">> Informe a quantidade de faltas <<");
    int faltas = sc.nextInt();

    double media = calcularMedia(n1, n2, n3);
    String sit = verificarSituacao(media, faltas);

    
    System.out.println("Média do aluno: " + media);
    System.out.println("Situação do aluno: " + sit);
    System.out.println("-----------------------");
  }

  public static double calcularMedia(double n1, double n2, double n3) {
    double media = (n1 + n2 + n3) / 3;
    return media;
  }

  public static String verificarSituacao(double media, int faltas) {
    String sit = "";
    if (faltas > 4) {
      sit = "DP por Falta";
    } else if (media > 8) {
      sit = ">> Aprovado com sucesso <<";
    } else if (media >= 6 && media < 8) {
      sit = ">> Aprovado <<";
    } else if (media >= 3 && media < 6) {
      sit = ">> Recuperação <<";
    } else if (media < 3) {
      sit = ">> Reprovado <<";
    } else {
      sit = ">> Desistente <<";
    }
    return sit;

  }

}
