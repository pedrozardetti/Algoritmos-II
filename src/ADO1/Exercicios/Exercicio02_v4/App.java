package Exercicio02_v4;

import java.util.Scanner;

public class App {
  public static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {

    Concessionaria conc = new Concessionaria();
    Veiculo veiculo = new Veiculo();

    System.out.println("\n---> Simulação de Compra de Veículo <---\n");
    System.out.println("Digite o valor do veículo: R$ ");
    veiculo.preco = sc.nextDouble();

    System.out.println("Digite a quantidade de parcelas: ");
    veiculo.parcelas = sc.nextInt();

    Resultado resultado = conc.calcularTotal(veiculo);
    System.out.printf("Valor do veículo: R$ %.2f\n", veiculo.preco);
    System.out.printf("Quantidade de parcelas: %d\n", veiculo.parcelas);
    System.out.printf("Taxa de juros: %.2f%%\n", resultado.juros * 100);
    System.out.printf("Valor da parcela: R$ %.2f\n", resultado.total);


    
  }

}
