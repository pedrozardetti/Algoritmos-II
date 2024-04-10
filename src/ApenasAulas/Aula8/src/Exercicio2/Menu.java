package Exercicio2;

import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        GerenciadorTarefas gerenciar = new GerenciadorTarefas();

        int opcao = 0;
        int pos;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Nova Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Alterar Tarefa");
            System.out.println("5. Marcar Concluída");
            System.out.println("0. Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nTarefa: ");
                    String tarefa = sc.next();

                case 2:
                    System.out.println("\nTodas Tarefas: ");
                    gerenciar.listar();
                    break;

                case 3:
                    System.out.println("\nPosição da tarefa à remover");
                    int rem = sc.nextInt();
                    gerenciar.remover(rem);
                    break;

                case 4:
                    System.out.println("\nPosição da tarefa à alterar");
                    int alt = sc.nextInt();
                    gerenciar.alterar(alt, tarefa, tarefa);
                    break;

                case 5:
                    System.out.println("\nPosição da tarefa à marcar como concluída");
                    int conc = sc.nextInt();
                    gerenciar.concluir(conc);
                    break;

            }
        } while (opcao != 0);
        System.out.println("Você saiu do programa!");
    }
}
