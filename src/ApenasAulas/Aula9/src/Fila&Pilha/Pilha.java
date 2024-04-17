import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {
  static Scanner ler = new Scanner(System.in);

  public static void main(String[] args) {
    Stack<Integer> numeros = new Stack<Integer>();

    // Adiciona na Pilha
    numeros.push(10);
    numeros.push(20);
    numeros.push(30);
    numeros.push(40);

    // Tamanho da PIlha
    int tam = numeros.size();

    // Verifica se a pilha está vazia
    boolean vazia = numeros.isEmpty();

    // Espia o próximo item da pilha
    int x = numeros.peek();

    // Retira o próximo item da pilha
    int prox = numeros.pop();

    System.out.println("Pilha -->");
    for (Integer item : numeros) {
      System.out.println(item);
    }

  }

}
