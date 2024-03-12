package ExercicioCalculadora;

import java.util.Scanner;

import publico.Tela;

public class App {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    Tela tela = new Tela();

    double n1, n2;
    int operacao;

    do {
      System.out.println("Qual a operação desejada?");
      System.out.println("1. Adição");
      System.out.println("2. Subtração");
      System.out.println("3. Multiplicação");
      System.out.println("4. Divisão");
      System.out.println("5 . Raiz Quadrada");
      System.out.println("6. Potência");
      System.out.println("0. Sair");
      operacao = tela.pedirOpcao("Digite o número da opção: ");

      if (operacao == 0) {
        System.out.println("O programa foi finalizado com sucesso!");
        break;
      }

      System.out.println("Informe o primeiro número");
      n1 = tela.pedirDouble();
      System.out.println("Informe o segundo número");
      n2 = tela.pedirDouble();

      switch (operacao) {
        case 1:
          System.out.println("Resultado da adição: " + calc.adicao(n1, n2));
          break;
        case 2:
          System.out.println("Resultado da subtração: " + calc.subtracao(n1, n2));
          break;
        case 3:
          System.out.println("Resultado da multiplicação: " + calc.multiplicacao(n1, n2));
          break;
        case 4:
          if (n2 != 0)
            System.out.println("Resultado da divisão: " + calc.divisao(n1, n2));
          else
            System.out.println("Não é possível dividir por zero!");
          break;
        case 5: 
          System.out.println("A raiz quadrada de "+n1+" é: " +calc.raizQuadrada(n1));
          break;
        case 6: 
          System.out.println("A potência de " +n1+" é: " +calc.potencia(n1, n2));
        default:
          System.out.println("A operação não existe nas opções disponíveis!");
      }
    } while (operacao != 0);

  }

}
