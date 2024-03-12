package Exercicio01_v4;

import java.util.Scanner;

public class App {
  public static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    Boletim bo = new Boletim();
    NotaAluno nota = new NotaAluno();
    Resultado res = new Resultado();

    System.out.println("----- PROGRAMA DE MEDIA -----");
    System.out.println(">> Informe a primeira nota <<");
    nota.n1 = sc.nextDouble();
    System.out.println(">> Informe a segunda nota");
    nota.n2 = sc.nextDouble();
    System.out.println(">> Informe a terceira nota <<");
    nota.n3 = sc.nextDouble();
    System.out.println(">> Informe a quantidade de faltas <<");
    nota.faltas = sc.nextInt();

    res = bo.calcularMedia(nota);

    System.out.printf("\n>> A média do aluno é %.2f. << \n", res.media);
    System.out.printf(">> Situação: %s <<", res.situacao);
  }
}
