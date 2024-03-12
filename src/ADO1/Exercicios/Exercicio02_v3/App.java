package Exercicio02_v3;

import java.util.Scanner;

public class App {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    Concessionaria conc = new Concessionaria();

    System.out.println("\n---> Simulação de Compra de Veículo <---\n");
    System.out.println("Digite o valor do veículo: R$ ");
    double preco = sc.nextDouble();

    System.out.println("Digite a quantidade de parcelas: ");
    int parcelas = sc.nextInt();

    double juros = conc.acharJuros(parcelas);
    double totalParcela = conc.calcularTotal(preco, parcelas, juros);

    System.out.printf("Valor do veículo: R$ %.2f\n", preco);
    System.out.printf("Quantidade de parcelas: %d\n", parcelas);
    System.out.printf("Taxa de juros: %.2f%%\n", juros * 100);
    System.out.printf("Valor da parcela: R$ %.2f\n", totalParcela);
  }
}
