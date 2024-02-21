import java.util.Scanner;

public class Aula1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            double n1 = pedirNota("Informe a primeira nota");
            double n2 = pedirNota("Informe a segunda nota");
            double n3 = pedirNota("Informe a terceira nota");

            double media = calcularMedia(n1, n2, n3);
            String sit = separarSituacao(media);

            escrever("A média é " + media);
            escrever("Situação " + sit);
        }

    }

    public static double calcularMedia(double n1, double n2, double n3) {
        double media = (n1 + n2 + n3) / 3;
        return media;
    }

    public static String separarSituacao(double media) {
        String situacao = "";
        if (media < 6)
            return "Aprovado";
        else
            return "Reprovado";
    }

    public static void escrever(String msg) {
        System.out.println(msg);
    }

    public static double pedirNota(String msg) {
        System.out.println(msg);
        double nota = sc.nextDouble();
        return nota;
    }

}
