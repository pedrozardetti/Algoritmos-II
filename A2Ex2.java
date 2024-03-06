import java.util.Scanner;

public class A2Ex2 {

  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Informe o valor do veículo");
    double valor = sc.nextDouble();
    System.out.println("Informe a quantidade de parcelas");
    double qtdParcelas = sc.nextInt();

    double juros;
    double resultadoFinal = valor * juros;

  }

  public static double juros(double qtdParcelas) {

    if (qtdParcelas == 1) {
      return juros = 0;
    } else if (qtdParcelas <= 6) {
      return juros = 0.03;
    } else {
      return juros = 0.05;
    }
  }

  public static double valorCarro(double valor, double juros) {
    double resultadoFinal = valor * juros;
    if (juros == 0) {
      return valor;
    } else if (juros == 0.03) {
      return resultadoFinal;
    } else {
      return resultadoFinal;
    }
  }

  public static double valorMensal(double valor, int qtdParcelas) {
    

}
