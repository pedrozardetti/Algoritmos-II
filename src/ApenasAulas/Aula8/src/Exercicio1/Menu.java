package Exercicio1;
import java.util.Scanner;

public class Menu {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        Blacklist listanegra = new Blacklist();

        int opcao = 0;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Novo Nome");
            System.out.println("2. Alterar Nome");
            System.out.println("3. Exibir Lista");
            System.out.println("4. Remover Nome");
            System.out.println("0. Sair");
            System.out.println("");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nNome: ");
                    String nome = ler.next();

                    listanegra.adicionar(nome);
                    break;

                case 2:
                    System.out.println("\nPosição: ");
                    int pos = ler.nextInt();

                    System.out.println("Novo Nome: ");
                    String novoNome = ler.next();

                    listanegra.alterar(pos, novoNome);
                    break;

                case 3:
                    listanegra.listar();
                    break;

                case 4:
                    System.out.println("\nPosição:");
                    int rem = ler.nextInt();

                    listanegra.remover(rem);
                    break;
            }
        } while (opcao != 0);
    }

}
