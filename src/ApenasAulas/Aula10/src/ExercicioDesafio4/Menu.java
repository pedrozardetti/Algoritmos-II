package ExercicioDesafio4;

// https://olimpiada.ic.unicamp.br/pratique/pj/2020/f2/lesma/
import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {

        CalcularDistancia calcular = new CalcularDistancia();

        
        System.out.println("Informe a altura do muro");
        int altura = sc.nextInt();
        System.out.println("Informe a distância que a lesma sobe a cada dia");
        int distanciaSobe = sc.nextInt();
        System.out.println("Informe a distancia que a lesma escorrega para baixo a cada noite");
        int distanciaDesce = sc.nextInt();

        int c = calcular.calcularDistancia(altura, distanciaSobe, distanciaDesce);

        System.out.println("A distância foi -> " + c);
    }
}
