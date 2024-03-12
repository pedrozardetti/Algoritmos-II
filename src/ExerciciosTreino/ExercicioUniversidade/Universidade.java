package ExercicioUniversidade;
public class Universidade {

  public int valorCurso(int opcao) {
    switch (opcao) {
      case 1:
        return 700;
      case 2:
        return 850;
      case 3:
        return 1100;

      default:
        System.out.println("Essa opção não existe :(");
        return 0;

    }

  }

  public double porcentagemDesconto(int opcao, int desc) {
    double valor = valorCurso(opcao);
    if (desc == 1) {
      return 0.5 * valor;
    } else if (desc == 2) {
      return 0.2 * valor;
    } else if (desc == 3) {
      return 0.6 * valor;
    } else {
      return valor;
    }
  }

  public double calcularMensalidade(int opcao, int desc) {
    double valorCursoSemDesconto = valorCurso(opcao);
    double valorDesconto = porcentagemDesconto(opcao, desc);
    return valorCursoSemDesconto - valorDesconto;
}


}
