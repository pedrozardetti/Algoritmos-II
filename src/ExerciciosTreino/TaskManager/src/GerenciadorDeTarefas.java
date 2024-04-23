import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class GerenciadorDeTarefas {

    public ArrayList<Tarefa> gerenciador = new ArrayList<>();

    public void run() {
        UI ui = new UI();
        int opcao = 0;
        do {
            opcao = ui.menu();

            switch (opcao) {
                case 1:
                    adicionar(ui.novaTarefa());
                    break;

                case 2:
                    listar();
                    break;

                case 3:
                    listar();
                    remover(ui.pedirTarefa());
                    break;

            }

        } while (opcao != 0);
    }

    public void adicionar(Tarefa tarefa) {
        gerenciador.add(tarefa);
    }

    public void remover(int id) {
        for (Tarefa item : gerenciador) {
            if (item.getId() == id) {
                gerenciador.remove(item);
            }
        }
    }

    public void listar() {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        for (Tarefa item : gerenciador) {
            System.out.println("ID da tarefa --> " + item.getId());
            System.out.println("Nome da tarefa --> " + item.getNome());
            System.out.println("Descrição da tarefa --> " + item.getDescricao());
            System.out.println("Horário que a tarefa foi criada --> " + item.getCreatedAt().format(fmt1));

        }
    }

    public void alterar(String campo, int id) {
        if (campo.equalsIgnoreCase("nome")) {

        } else if (campo.equalsIgnoreCase("descricao")) {

        } else {
            return;
        }
    }

}
