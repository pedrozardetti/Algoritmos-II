package Recursividade;

public class Fatorial {

    public static void main(String[] args) {

        int f = fatorial(4, 1);
        System.out.println(f);
    }

    public static int fatorial(int num, int fat) { // jeito 1 de fazer
        if (num > 1) {
            return fatorial(num - 1, fat * num);
        } else
            return fat;
    }

    public static int fatorial(int num) { // jeito 2 de fazer - Recursão Iterativa
        if (num == 1) {
            return 1;
        } else
            return num * fatorial(num - 1); // Recursão Linear
    }
}
