package ExercicioMedia;

import publico.Tela;

public class App {


    public static void main(String[] args) {
        Boletim bo = new Boletim();
        Tela tela = new Tela();

        tela.escrever("--> PROGRAMA DA MÉDIA <--");

        double nota1 = tela.pedirNota("Informe a primeira nota");
        double nota2 = tela.pedirNota("Informe a seguda nota");
        double nota3 = tela.pedirNota("Informe a terceira nota");
        int faltas = tela.pedirFaltas("Informe a qtd de faltas");

        double media = bo.calcularMedia(nota1, nota2, nota3);
        String sit = bo.verificarSituacao(media, faltas);

        tela.formatar("\nA média do aluno é %.2f. \n", media);
        tela.formatar("Situação: %s ", sit);
    }
}