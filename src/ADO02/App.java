package Exercicio;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Universidade universidade = new Universidade();
        Opcoes opcoes = new Opcoes();
        System.out.println("Selecione o curso desejado:");
        System.out.println("1 - Sistemas de Informação (R$ 550,00)");
        System.out.println("2 - Análise e Desenv. Sistemas (R$ 750,00)");
        System.out.println("3 - Ciência da Computação (R$ 1.150,00)");
        System.out.println("4 - Engenharia da Computação (R$ 1.300,00)");
        System.out.println("5 - Engenharia de Software (R$ 950,00)");
        int codCurso = ler.nextInt();

        System.out.println("\nSelecione o programa de bolsa (ou 0 para nenhum):");
        System.out.println("1 - Escola Pública (50%)");
        System.out.println("2 - Bolsista (20%)");
        System.out.println("3 - Ex-aluno (60%)");
        System.out.println("4 - Tutor (100%)");
        System.out.println("0 - Sem bolsa");
        int codBolsa = ler.nextInt();

        opcoes.codCurso = codCurso;
        opcoes.codBolsa = codBolsa;

        Resultado resultado = universidade.calcularMensalidade(opcoes);

        System.out.println("Voce teve " + (resultado.desconto * 100) + " de desconto pelo programa de "+resultado.programaBolsa+ " no curso "+resultado.curso+ ", a parcela sera R$ "+resultado.mensalidade);
    }
    
}