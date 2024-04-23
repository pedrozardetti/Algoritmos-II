import java.util.Scanner;

public class UI {
    public Scanner sc = new Scanner(System.in);

    public int menu() {
        System.out.println("1. Nova Tarefa");
        System.out.println("2. Listar Tarefas");
        System.out.println("3. Remover Tarefa");
        System.out.println("4. Marcar como resolvido");
        System.out.println("0. Sair");
        return sc.nextInt();
    }


    public Tarefa novaTarefa() {
        System.out.println("Informe o ID da nova tarefa");
        int id = sc.nextInt();
        System.out.println("Informe a nova tarefa");
        String novaTarefa = sc.nextLine();
        sc.next();
        System.out.println("Informe a descrição da nova tarefa");
        String novaDesc = sc.nextLine();
        Tarefa t = new Tarefa(id, novaTarefa, novaDesc);
        return t;
    }

    public int pedirTarefa() {
        System.out.println("Qual o ID da tarefa que deseja remover?");
        int id = sc.nextInt();
        return id;
    }

}

