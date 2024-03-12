package Exercicio03_v3;

class Universidade {

  public double calcularMensalidade(double valorCurso, double desconto) {
    return valorCurso - (valorCurso * desconto);
  }

  public String nomeCurso(int opcaoCurso) {
    switch (opcaoCurso) {
      case 1:
        return "Sistemas de Informação";
      case 2:
        return "Análise e Desenv. Sistemas";
      case 3:
        return "Ciência da Computação";
      case 4:
        return "Engenharia da Computação";
      case 5:
        return "Engenharia de Software";
      default:
        return "Curso inválido";
    }
  }

  public double mensalidadeCurso(int opcaoCurso) {
    switch (opcaoCurso) {
      case 1:
        return 550.0;
      case 2:
        return 750.0;
      case 3:
        return 1150.0;
      case 4:
        return 1300.0;
      case 5:
        return 950.0;
      default:
        System.out.println("Opção inválida!");
        return 0.0;
    }
  }

  public String nomeBolsa(int opcaoBolsa) {
    switch (opcaoBolsa) {
      case 1:
        return "Escola Pública";
      case 2:
        return "Bolsista";
      case 3:
        return "Ex-aluno";
      case 4:
        return "Tutor";
      case 0:
        return "Sem bolsa";
      default:
        System.out.println("Opção inválida!");
        return "";
    }
  }

  public double descontoBolsa(int opcaoBolsa) {
    switch (opcaoBolsa) {
      case 1:
        return 0.5;
      case 2:
        return 0.2;
      case 3:
        return 0.6;
      case 4:
        return 1.0;
      case 0:
        return 0.0;
      default:
        System.out.println("Opção inválida!");
        return 0.0;
    }

  }
}
