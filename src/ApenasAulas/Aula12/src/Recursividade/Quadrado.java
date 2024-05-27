package Recursividade;

import java.util.Scanner;

public class Quadrado {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Vamos formar um quadrado!");
        System.out.println("Quais serão as proporções do quadrado?");
        int tamanho = sc.nextInt();

        quadrado(tamanho, tamanho);
    }

    public static void linha(int tamanho) {

        if (tamanho != 0) {
            System.out.printf("* ");
            linha(tamanho - 1);
        }
    }

    public static void quadrado(int cont, int tamanho) {
        if (cont != 0) {
            linha(tamanho);
            System.out.println();
            quadrado(cont - 1, tamanho);
        }
    }
}
