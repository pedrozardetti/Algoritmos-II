package ExercicioDesafio2;

import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CalcularMoedas calcular = new CalcularMoedas();
        
        System.out.println("Quantas moedas tem na arca?");
        int moedas = sc.nextInt();
        System.out.println("Quantos marinheiros (sem contar o capitão) tem no barco?");
        int marinheiros = sc.nextInt();
        
        int moedasDoCapitao = calcular.calcularMarinheiro(moedas, marinheiros);
        
        System.out.println("O Capitão Olho Roxo deve receber " + moedasDoCapitao + " moedas.");
    }
}
