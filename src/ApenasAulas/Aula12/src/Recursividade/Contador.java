package Recursividade;

import java.util.Scanner;

public class Contador {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int ult = 16; // numero ficticio do usuário
        contar(0, ult); // 0 representa o início e ult representa o número ficticio
    }

    public static void contar(int contador, int fim) {
        if (contador == fim) { // enquanto 0 não chegar no número que usuário forneceu
            System.out.println(contador);
            System.out.println("Você chegou ao fim!");
        } else {
            System.out.println(contador);
            contar(contador + 1, fim); // recursão até chegar ao numero ficticio
        }
    }

    public static void contarRegressivo(int fim) {

        if (fim == 0) {
            System.out.println(fim);
        } else {
            System.out.println(fim);
            contarRegressivo(fim - 1);
        }

    }

}
