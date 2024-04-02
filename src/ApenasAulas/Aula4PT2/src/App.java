import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        NotaAluno notas = new NotaAluno();

        System.out.println("Nota 1:");
        notas.nota1 = sc.nextDouble();
        System.out.println("Nota 2:");
        notas.nota2 = sc.nextDouble();
        System.out.println("Nota 3:");
        notas.nota3 = sc.nextDouble();
        System.out.println("Faltas:");
        notas.faltas = sc.nextInt();

        Boletim bo = new Boletim();
        Resultado res = bo.calcularMedia(notas);
        System.out.println("Média: " + res.media);
        System.out.println("Situação: " + res.situacao);

    }
}
