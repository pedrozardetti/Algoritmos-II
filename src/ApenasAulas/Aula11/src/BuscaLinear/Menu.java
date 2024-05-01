import java.util.Random;
import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        BuscarNumero buscar = new BuscarNumero();
        Random random = new Random();

        
            System.out.println("Qual tamanho desejado do vetor?");
            int numero = sc.nextInt();
            for (int i = 0; i <= numero; i++) {
                int numeroAleatorio = random.nextInt(100);
                System.out.println(numeroAleatorio);
                
            }
            System.out.println("Qual número você está buscando?");
            int numeroBusca = sc.nextInt();

        
        }
    }

