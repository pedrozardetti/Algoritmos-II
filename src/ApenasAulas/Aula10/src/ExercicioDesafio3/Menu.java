package ExercicioDesafio3;

import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        CalcularParcelas calcular = new CalcularParcelas();
        
        System.out.println("Informe o valor da compra");
        int valorCompra = sc.nextInt();
        System.out.println("Informe o número de parcelas");
        int parcelas = sc.nextInt();
        
        calcular.parcelas(valorCompra, parcelas);
    }
}
