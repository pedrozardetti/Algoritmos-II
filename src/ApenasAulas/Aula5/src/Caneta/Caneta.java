package Caneta;
public class Caneta {
  
  public String corTinta;
  public int nivelTinta;

  public void escrever (String mensagem) {
    if (nivelTinta <= 0) {
      System.out.println("Caneta vazia");
      return;
    }

    System.out.printf("Caneta %s (%d%%) escrevendo: \n", corTinta, nivelTinta);
    System.out.println(mensagem);
    System.out.println("-------");

    nivelTinta -= 1;

  }
}