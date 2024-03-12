package Exercicio01_v3;

class Boletim {

  public double calcularMedia(double n1, double n2, double n3) {
    double media = (n1 + n2 + n3) / 3;
    return media;
  }

  public String verificarSituacao(double media, int faltas) {
    String sit = "";
    if (faltas > 4) {
      sit = "DP por Falta";
    } else if (media >= 8) {
      sit = ">> Aprovado com sucesso <<";
    } else if (media >= 6 && media < 8) {
      sit = ">> Aprovado <<";
    } else if (media >= 3 && media < 6) {
      sit = ">> Recuperação <<";
    } else if (media < 3) {
      sit = ">> DP por Nota <<";
    } else {
      sit = ">> Desistente <<";
    }
    return sit;

  }

}
