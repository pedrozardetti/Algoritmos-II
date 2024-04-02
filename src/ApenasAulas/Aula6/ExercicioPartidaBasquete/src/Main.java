import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int opcao = 0;

        PartidaBasquete partida = new PartidaBasquete();
        Resultado res = new Resultado();

        System.out.println("Qual o nome do time mandante?");
        partida.mandante = sc.nextLine();

        System.out.println("Qual o nome do time visitante?");
        partida.visitante = sc.nextLine();

        do {
            opcao = menu();

            if (opcao == 1) {
                System.out.println();
            }
            
        } while (opcao != 2);
        System.out.println("O jogo acabou!");
        System.out.printf("O vencedor foi -> %s & o perdedor foi -> %s", res.vencedor, res.perdedor);
        System.out.println("O resultado final do jogo foi -->");
        System.out.printf("%s x %s", partida.mandante, partida.visitante);
        System.out.printf("%d - %d", partida.pontosMandante, partida.pontosVisitante);
    }

    public static int menu() {
        System.out.println("MENU DA NBA");
        System.out.println("1. Nova Cesta");
        System.out.println("2. Encerrar Jogo");
    
        return sc.nextInt();
    }

}
