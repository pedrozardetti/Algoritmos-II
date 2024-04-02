import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        Outback back = new Outback();

        System.out.println("Mesa: ");
        back.mesa = ler.nextInt();

        System.out.println("Qtd. Pessoas: ");
        back.pessoas = ler.nextInt();

        
        int opcao = 0;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Pedir");
            System.out.println("2. Fechar");
            System.out.println("0. Sair");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Descrição: ");
                    ler.nextLine();
                    String d = ler.nextLine();

                    System.out.println("Valor: ");
                    double v = ler.nextDouble();

                    back.pedir(d, v);
                    break;

                case 2:
                    System.out.println("Pagar taxa (sim/não): ");
                    ler.nextLine();
                    boolean pagar = ler.nextLine().equalsIgnoreCase("sim");

                    NotaFiscal nf = back.fechar(pagar);
                    System.out.println("Total: " + nf.totalFinal);
                    System.out.println("Taxa: " + nf.taxaServico);
                    System.out.println("Valor Pessoa: " + nf.valorPorPessoa);
                    break;
            }
        }
        while (opcao != 0);

        
    }

}