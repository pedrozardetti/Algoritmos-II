package ExerciciosArrayList;
import java.util.*;

public class Exercicio3 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    ArrayList<Double> notas = new ArrayList<Double>();

    double n = 0;
    do {
      System.out.println("Informe as notas desejadas");
      n = sc.nextDouble();

      if (n >= 0) {
        notas.add(n);
      }

    } while (n != -1);
    System.out.println("As notas foram --> " + notas);
  }
}
