package Exercicio02_v1;

import java.util.Scanner;

public class App {
  public static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {

    System.out.println("\n---> Simulação de Compra de Veículo <---\n");
    System.out.println("Digite o valor do veículo: R$ ");
    double preco = sc.nextDouble();

    System.out.println("Digite a quantidade de parcelas: ");
    int parcelas = sc.nextInt();

    double taxaJuros = 0;
    if (parcelas > 1 && parcelas <= 6) {
      taxaJuros = 0.03;
    } else if (parcelas > 6) {
      taxaJuros = 0.05;
    }

    double valorParcela = (preco * (1 + taxaJuros)) / parcelas;

    System.out.printf("Valor do veículo: R$ %.2f\n", preco);
    System.out.printf("Quantidade de parcelas: %d\n", parcelas);
    System.out.printf("Taxa de juros: %.2f%%\n", taxaJuros * 100);
    System.out.printf("Valor da parcela: R$ %.2f\n", valorParcela);
  }
}
