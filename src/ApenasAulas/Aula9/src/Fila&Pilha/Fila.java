import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Fila {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        Queue<Integer> numeros = new ArrayDeque<Integer>();

        // Adiciona na Fila
        numeros.offer(10);
        numeros.offer(20);
        numeros.offer(30);
        numeros.offer(40);

        // Tamanho da Fila
        int tam = numeros.size();

        // Verifica se a fila está vazia
        boolean vazia = numeros.isEmpty();

        // Retira o próximo item da fila
        int prox = numeros.poll();

        // espia o próximo item da fila
        int x = numeros.peek();

        System.out.println("Fila -->");
        for (int item : numeros) {
            System.out.println(item);
            System.out.println("O primeiro elemento da fila é " + numeros.peek());
        }

    }

}
