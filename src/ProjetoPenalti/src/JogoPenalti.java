import java.util.ArrayList;
import java.util.Scanner;

public class JogoPenalti {
    private Scanner sc;
    private EscolherDirecao escolher;
    private ArrayList<ResultadoRodada> resultados;
    private String nomeJogador;
    private String nomeGoleiro;

    public JogoPenalti() {
        this.sc = new Scanner(System.in);
        this.escolher = new EscolherDirecao();
        this.resultados = new ArrayList<>();
    }

    public void executar() {
        int opcao;
        do {
            mostrarMenu();
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    iniciarJogo();
                    break;
                case 2:
                    MostrarPlacar exibir = new MostrarPlacar(resultados, nomeJogador, nomeGoleiro);
                    exibir.exibirPlacar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 0);
        System.out.println("Você saiu do nosso programa de pênalti");
    }

    private void mostrarMenu() {
        System.out.println("\n--- Bem vindo ao FIFA 25 ---");
        System.out.println("Aqui iremos apresentar um tutorial do programa!");
        System.out.println(
                "Um jogador deve escolher um canto para cobrar o pênalti e o outro jogador deve escolher um canto para defendê-lo!");
        System.out.println("Os lados vão variar entre 1 a 5, sendo respectivamente: ");
        System.out.println("(1) - Canto superior direito");
        System.out.println("(2) - Canto inferior direito");
        System.out.println("(3) - Canto superior esquerdo");
        System.out.println("(4) - Canto inferior esquerdo");
        System.out.println("(5) - Meio");
        System.out.println("----------------------------------------------");
        System.out.println("\nQual opção você deseja?");
        System.out.println("1. Iniciar o jogo");
        System.out.println("2. Exibir placar");
        System.out.println("0. Sair");
    }

    private void iniciarJogo() {
        System.out.println("\nQual é o nome do jogador?");
        sc.nextLine();
        nomeJogador = sc.nextLine();

        System.out.println("\nQual é o nome do goleiro?");
        nomeGoleiro = sc.nextLine();
        System.out.println("----------------------------------------------");

        Penalti penalti = new Penalti(nomeJogador, nomeGoleiro);
        escolher.informarNome(penalti);

        int rodada = 0;
        int golsJogador = 0;
        int golsGoleiro = 0;
        int defesasJogador = 0;
        int defesasGoleiro = 0;

        while (rodada < 6) {
            System.out.println("\nRodada " + (rodada + 1));

            if (rodada % 2 == 0) {
                realizarJogada(nomeJogador, nomeGoleiro, penalti);
                if (escolher.isGol(penalti)) {
                    golsJogador++;
                } else {
                    defesasGoleiro++;
                }
            } else {
                realizarJogada(nomeGoleiro, nomeJogador, penalti);
                if (escolher.isGol(penalti)) {
                    golsGoleiro++;
                } else {
                    defesasJogador++;
                }
            }

            // Armazenar o resultado da rodada na ArrayList
            resultados.add(new ResultadoRodada(golsJogador, golsGoleiro, defesasJogador, defesasGoleiro));

            rodada++;
        }

        System.out.println("\nFim de jogo!");
        AudioPlayer.playFinalSound();
        System.out.println("Total de gols do " + nomeJogador + ": " + golsJogador + " de 3 rodadas");
        System.out.println("Total de defesas do " + nomeGoleiro + ": " + defesasGoleiro + " de 3 rodadas");
        System.out.println("Total de gols do " + nomeGoleiro + ": " + golsGoleiro + " de 3 rodadas");
        System.out.println("Total de defesas do " + nomeJogador + ": " + defesasJogador + " de 3 rodadas");
    }

    private void realizarJogada(String jogador, String goleiro, Penalti penalti) {
        System.out.println(jogador + " vai chutar e " + goleiro + " vai defender.");
        System.out.println("\nQual lado nosso " + jogador + " vai cobrar o pênalti? (1-5)");
        int escolherLadoJogador = sc.nextInt();
        penalti.setEscolhaJogador(escolherLadoJogador);

        System.out.println("Qual lado nosso " + goleiro + " vai tentar defender? (1-5)");
        int escolherLadoGoleiro = sc.nextInt();
        penalti.setEscolhaGoleiro(escolherLadoGoleiro);

        System.out.println("Ele vai para a batida...");
    }
}


