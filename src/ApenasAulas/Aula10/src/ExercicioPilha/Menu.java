package ExercicioPilha;
import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        ListaReproducao lista = new ListaReproducao();

        int opcao = 0;

        do {
            System.out.println("\nMENU SPOTIFY");
            System.out.println("O que deseja fazer?");
            System.out.println("1. Adicionar Música");
            System.out.println("2. Tocar Próxima");
            System.out.println("3. Listar Músicas");
            System.out.println("0. Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome da música");
                    String nomeMusica = sc.next();
                    sc.nextLine();
                    System.out.println("Informe o nome do artista");
                    String nomeArtista = sc.next();
                    sc.nextLine();
                    System.out.println("Informe o código do YouTube");
                    String codigo = sc.next();
                    sc.nextLine();

                    Musica musica = new Musica();
                    musica.nome = nomeMusica;
                    musica.artista = nomeArtista;
                    musica.codYoutube = codigo;

                    lista.adicionar(musica);

                    
                    break;

                case 2:
                    lista.tocarProxima();
                    break;

                case 3:
                    lista.exibirLista();
                    break;
            }

        } while (opcao != 0);
        System.out.println("Você saiu do Spotify :)");
    }
}
