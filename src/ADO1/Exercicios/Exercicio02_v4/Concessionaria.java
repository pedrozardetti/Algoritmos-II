package Exercicio02_v4;

public class Concessionaria {

  public double acharJuros(int parcelas) {
    double taxaJuros = 0;
    if (parcelas > 1 && parcelas <= 6) {
      taxaJuros = 0.03;
    } else if (parcelas > 6) {
      taxaJuros = 0.05;
    }
    return taxaJuros;
  }

  public Resultado calcularTotal(Veiculo veiculo) {
    Resultado resultado = new Resultado();
    double valorParcela = (veiculo.preco * (1 + acharJuros(veiculo.parcelas))) / veiculo.parcelas;
    resultado.total = valorParcela;
    resultado.juros = acharJuros(veiculo.parcelas);
    return resultado;

  }
}
