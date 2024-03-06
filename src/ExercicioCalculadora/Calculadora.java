package ExercicioCalculadora;

class Calculadora {

  public double adicao(double n1, double n2) {
    return n1 + n2;
  }

  public double subtracao(double n1, double n2) {
    return n1 - n2;
  }

  public double multiplicacao(double n1, double n2) {
    return n1 * n2;
  }

  public double divisao(double n1, double n2) {
    return n1 / n2;
  }

  public double raizQuadrada(double n1) {
    return Math.sqrt(n1);
  }

  public double potencia(double base, double expoente) {
    for (int i = 0; i < expoente; i++) {
      base *= base;
    }
    return base;
  }

}
