package ExerciciosArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        ArrayList<Double> notas2 = new ArrayList<Double>();

        System.out.println("Qts notas?");
        int tam = sc.nextInt();

        for (int i = 0; i < tam; i++) {
            System.out.println("Informe a nota da posição: " + i);
            notas2.add(sc.nextDouble());
        }

        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(7.5);
        notas.add(4.0);
        notas.add(5.0);

        notas.set(0, 8.5);

        notas.remove(4.0);

        System.out.println("Qtd de notas: " + notas.size());

        System.out.println("--Notas--"); // VARIAÇÃO COM FOREACH
        for (double n : notas) {
            System.out.println(n);
        }

        System.out.println("--Notas--"); // VARIAÇÃO COM FOR + GET
        for (int i = 0; i < notas.size(); i++) {
            double n = notas.get(i);
            System.out.println(n);
        }

    }
}
