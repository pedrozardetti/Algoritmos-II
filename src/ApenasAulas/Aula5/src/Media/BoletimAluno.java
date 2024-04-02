package Media;

public class BoletimAluno {
  public double nota1;
  public double nota2;
  public double nota3;
  public int faltas;

  public double media;
  public String situacao;

  public void calcularMedia() {
    media = (nota1 + nota2 + nota3) / 3;
    verificarSituacao();

  }

  public void verificarSituacao() {
    if (faltas > 4) {
      situacao = "DP por Falta";
    } else if (media >= 6) {
      situacao = "Aprovado";
    } else {
      situacao = "Reprovado";
    }
  }

}
