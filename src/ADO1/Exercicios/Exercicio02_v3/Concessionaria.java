package Exercicio02_v3;

class Concessionaria {

  public double acharJuros(int parcelas) {
    double taxaJuros = 0;
    if (parcelas > 1 && parcelas <= 6) {
      taxaJuros = 0.03;
    } else if (parcelas > 6) {
      taxaJuros = 0.05;
    }
    return taxaJuros;
  }

  public double calcularTotal(double preco, int parcelas, double taxaJuros) {
    double valorParcela = (preco * (1 + taxaJuros)) / parcelas;
    return valorParcela;

  }
}
