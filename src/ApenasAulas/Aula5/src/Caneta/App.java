package Caneta;
public class App {
    public static void main(String[] args) throws Exception {
        
        Caneta c1 = new Caneta();
        c1.corTinta = "azul";
        c1.nivelTinta = 100;

        c1.escrever("Oi linda ;)");
        c1.escrever("Solteira vida?");

        Caneta c2 = new Caneta();
        c2.corTinta = "azul";
        c2.nivelTinta = 100;

        c2.escrever("Oi príncipe!");
        c2.escrever("Sou assexuada :(");




    }
}
