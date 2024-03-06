public class Boletim {
  public Resultado calcularMedia(NotaAluno notas) {
    double media = (notas.nota1 + notas.nota2 + notas.nota3) / 3;
    String situacao = verificarSituacao(media, notas.faltas);

    Resultado res = new Resultado();
    res.media = media;
    res.situacao = situacao;

    return res;
  }

  private String verificarSituacao(double media, int faltas) {
    String sit = "";
    if (faltas > 4)
      sit = "DP por faltas";
    else if (faltas >= 6)
      sit = "Aprovado";
    else
      sit = "DP por notas";

    return sit;
  }
}
