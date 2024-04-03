package ExercicioMedia;

import java.util.ArrayList;

public class MediaAluno {

  private ArrayList<Double> notas = new ArrayList<Double>();

  public void novaNota(double n) {
    notas.add(n);
  }

  public double media() {
    double soma = 0;
    for (double nota : notas) {
      soma += nota;
    }
    double m = soma / notas.size();
    return m;

  }

  public String situacao() {
    String s = "";

    double m = media();
    if (m >= 6) {
      s = "Aprovado";
    } else {
      s = "DP";
    }
    return s;

  }
}
