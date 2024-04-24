package ExercicioPilha;
import java.util.Stack;

public class ListaReproducao {

    private Stack<Musica> itens = new Stack<>();

    public void adicionar(Musica musica) {
        itens.push(musica);
    }

    public void tocarProxima() throws Exception {
        Musica m = itens.pop();

        String url = "https://www.youtube.com/watch?v=" + m.codYoutube;
        Runtime.getRuntime().exec("cmd.exe /C start microsoft-edge:" + url);


    }

    public void exibirLista() {
        for (Musica musica : itens) {
            System.out.println("Música - " + musica.nome);
            System.out.println("Artista - " + musica.artista);
            System.out.println("URL - https://www.youtube.com/watch?v=" + musica.codYoutube);
        }
    }
}
