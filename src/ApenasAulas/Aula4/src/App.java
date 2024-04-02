public class App {
    public static void main(String[] args) throws Exception {
        Caneta caneta1 = new Caneta();
        caneta1.cor = "\u001B[31m" + "Vermelha";
        caneta1.nivelTinta = 66;

        Caneta caneta2 = new Caneta();
        caneta2.cor = "Azul";
        caneta2.nivelTinta = 77;

        Lousa lousa = new Lousa();
        lousa.escrever("Oi linda!", caneta1);
        lousa.escrever("Solteira?", caneta2);

    }
}
