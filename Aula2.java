import java.util.Scanner;

public class Aula2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double n1, n2;
        int operacao;

        do {
            System.out.println("Qual a operação desejada?");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");
            operacao = sc.nextInt();

            if (operacao == 0) {
                System.out.println("O programa foi finalizado com sucesso!");
                break;
            }

            System.out.println("Informe o primeiro número");
            n1 = sc.nextDouble();
            System.out.println("Informe o segundo número");
            n2 = sc.nextDouble();

            switch (operacao) {
                case 1:
                    System.out.println("Resultado da adição: " + adicao(n1, n2));
                    break;
                case 2:
                    System.out.println("Resultado da subtração: " + subtracao(n1, n2));
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação: " + multiplicacao(n1, n2));
                    break;
                case 4:
                    if (n2 != 0)
                        System.out.println("Resultado da divisão: " + divisao(n1, n2));
                    else
                        System.out.println("Não é possível dividir por zero!");
                    break;
                default:
                    System.out.println("A operação não existe nas opções disponíveis!");
            }
        } while (operacao != 0);
    }

    public static double adicao(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtracao(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }

    public static double divisao(double n1, double n2) {
        return n1 / n2;
    }
}
