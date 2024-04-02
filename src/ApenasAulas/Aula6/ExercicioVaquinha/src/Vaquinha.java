public class Vaquinha {

  double arrecadado;
  double meta;
  String objetivo;

  public void doar(double valor) {
    this.arrecadado += valor;

  }

  public void analisar() {
    double porcentagem = this.arrecadado / this.meta * 100;

    System.out.printf("\nPara o objetivo [%s] \n", this.objetivo);
    System.out.printf("Meta: %.2f \n", this.meta);
    System.out.printf("Alcance: %.2f%% \n", porcentagem);
  }

}