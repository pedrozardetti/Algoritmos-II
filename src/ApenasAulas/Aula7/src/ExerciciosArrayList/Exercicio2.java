package ExerciciosArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    ArrayList<Double> notas = new ArrayList<Double>();

    System.out.println("Quantas notas você quer?");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.println("Informe a nota da posição --> " + i);
      notas.add(sc.nextDouble());

    }

    System.out.println("Quantidade de notas --> " + n);
    System.out.println("--Notas--"); 
    for (double nt : notas) {
      System.out.println(nt);

    }
  }
}
