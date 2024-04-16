package Exercicio2;

import java.util.Scanner;

public class Menu {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        int opcao = 0;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Nova tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Alterar tarefa");
            System.out.println("5. Marcar concluída");
            System.out.println("0. Sair");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nCódigo: ");
                    ler.nextLine();
                    String cod = ler.nextLine();

                    System.out.println("\nTarefa: ");
                    String desc = ler.nextLine();

                    Tarefa novaTarefa = new Tarefa();
                    novaTarefa.descricao = desc;
                    novaTarefa.codigo = cod;
                    novaTarefa.concluida = false;

                    gerenciador.novaTarefa(novaTarefa);

                    break;

                case 2:
                    gerenciador.listar();
                    break;

                case 3:
                    System.out.println("\nPosição: ");
                    int pos = ler.nextInt();

                    gerenciador.remover(pos);
                    break;

                case 4:
                    break;

                case 5:
                    System.out.println("\nPosição: ");
                    int pos2 = ler.nextInt();

                    gerenciador.concluir(pos2);
                    break;
            }
        } while (opcao != 0);
    }

}
