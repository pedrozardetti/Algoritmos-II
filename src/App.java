import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Universidade uni = new Universidade();
        Tela tela = new Tela();
        
        tela.escrever(">>> CÁLCULO DE MATRÍCULA <<<");

        System.out.println("Informe a opção do curso matriculado");
        System.out.println("1. Administração - R$700,00");
        System.out.println("2. Design Digital - R$850,00");
        System.out.println("3. ADS - R$1100,00");
        int opcao = sc.nextInt();

        System.out.println("Qual o programa de desconto você se enquadra? (1-4)");
        System.out.println("1. Escola Pública - 50%");
        System.out.println("2. Bolsista - 20%");
        System.out.println("3. Ex-Aluno - 60%");
        System.out.println("4. Tutor - 100%");
        int desc = sc.nextInt();

        double curso = uni.valorCurso(opcao);
        double desconto = uni.porcentagemDesconto(opcao, desc);
        double mensalidade = uni.calcularMensalidade(opcao, desc);

        tela.formatar("\nO desconto que foi teve no curso foi de R$%.2f. \n", desconto);
        tela.formatar("A parcela será de R$%.2f ", mensalidade);

    }

}

