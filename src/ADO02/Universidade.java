package Exercicio;

public class Universidade {

    public Resultado calcularMensalidade(Opcoes opcoes) {
        Resultado resultado = new Resultado();
        resultado.curso = nomeCurso(opcoes.codCurso);
        resultado.programaBolsa = nomeBolsa(opcoes.codBolsa);
        resultado.desconto = descontoBolsa(opcoes.codBolsa);
        resultado.mensalidade = mensalidadeCurso(opcoes.codCurso) - (mensalidadeCurso(opcoes.codCurso) * resultado.desconto);

        return resultado;
    }

    public String nomeCurso(int cod) {
        switch (cod) {
            case 1:
                return "Sistemas de informacao";
            case 2:
                return "ADS";
            case 3:
                return "Ciencias da computacao";
            case 4:
                return "Engenharia da computacao";
            case 5:
                return "Engenharia de software";
            default:
                return "Curso invalido";
        }
    }

    public double mensalidadeCurso(int cod) {
        switch (cod) {
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
                System.out.println("Opcao invalida");
                return -1.0;
        }
    }

    public String nomeBolsa(int cod) {
        switch (cod) {
            case 1:
                return "Escola publica";
            case 2:
                return "Bolsista";
            case 3:
                return "Ex-aluno";
            case 4:
                return "Tutor";
            case 0:
                return "Sem bolsa";
            default:
                return "Opcao invalida";
        }
    }

    public double descontoBolsa(int cod) {
        switch (cod) {
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
                System.out.println("Opcao invalida");
                return 0.0;
        }
    }


}
