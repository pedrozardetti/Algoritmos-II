public class Lousa {

  public void escrever(String msg, Caneta caneta) {
    System.out.println("\u001B[31m" + ">> Caneta escrevendo: ");
    System.out.println("\u001B[34m" + ">> Cor: " + caneta.cor);
    System.out.println(">> Nível: " + caneta.nivelTinta);
    System.out.println(msg);

    caneta.nivelTinta--;
    System.out.println("-------");
  }
}
