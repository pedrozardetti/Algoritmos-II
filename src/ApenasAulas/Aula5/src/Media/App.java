package Media;

public class App {

  public static void main(String[] args) {

    BoletimAluno bo = new BoletimAluno();
    bo.nota1 = 8;
    bo.nota2 = 6;
    bo.nota3 = 4;
    bo.faltas = 0;

    bo.calcularMedia();
    
    System.out.println("--> Média: " +bo.media);
    System.out.println("--> Situação: " +bo.situacao);
  }
}
