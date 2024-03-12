package Exercicio01_v3;

import java.util.Scanner;

public class App {

  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws Exception {

    Boletim bo = new Boletim();

    System.out.println("----- PROGRAMA DE MEDIA -----");
    System.out.println(">> Informe a primeira nota <<");
    double n1 = sc.nextDouble();
    System.out.println(">> Informe a segunda nota");
    double n2 = sc.nextDouble();
    System.out.println(">> Informe a terceira nota <<");
    double n3 = sc.nextDouble();
    System.out.println(">> Informe a quantidade de faltas <<");
    int faltas = sc.nextInt();

    double media = bo.calcularMedia(n1, n2, n3);
    String sit = bo.verificarSituacao(media, faltas);


    System.out.printf("\n>> A média do aluno é %.2f. << \n", media);
    System.out.printf(">> Situação: %s <<", sit);
    

  }
}
