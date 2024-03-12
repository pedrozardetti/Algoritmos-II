package Exercicio01_v4;

public class Boletim {
  public Resultado calcularMedia(NotaAluno notas) {
    Resultado resultado = new Resultado();
    resultado.media = (notas.n1 + notas.n2 + notas.n3) / 3;
    resultado.situacao = verificarSituacao(resultado.media, notas.faltas);
    return resultado;
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
