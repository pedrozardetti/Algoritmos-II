import java.util.ArrayList;

public class MostrarPlacar {

    private ArrayList<ResultadoRodada> resultados; // 1..n
    private String nomeJogador;
    private String nomeGoleiro;

    public MostrarPlacar(ArrayList<ResultadoRodada> resultados, String nomeJogador, String nomeGoleiro) {
        this.resultados = resultados;
        this.nomeJogador = nomeJogador;
        this.nomeGoleiro = nomeGoleiro;
    }

    public void exibirPlacar() {
        System.out.println("--- Placar ---");
        for (int i = 0; i < resultados.size(); i++) {
            ResultadoRodada resultado = resultados.get(i);
            System.out.println("Rodada " + (i + 1) + ":");
            System.out.println("Gols do " + nomeJogador + ": " + resultado.getGolsJogador());
            System.out.println("Gols do " + nomeGoleiro + ": " + resultado.getGolsGoleiro());
            System.out.println("Defesas do " + nomeJogador + ": " + resultado.getDefesasJogador());
            System.out.println("Defesas do " + nomeGoleiro + ": " + resultado.getDefesasGoleiro());
            System.out.println("----------------------");
        }
    }
}




