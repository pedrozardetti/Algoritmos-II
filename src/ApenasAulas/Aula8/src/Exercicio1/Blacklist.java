package Exercicio1;
import java.util.ArrayList;

public class Blacklist {
    private ArrayList<String> pessoas = new ArrayList<String>();

    public void adicionar(String pessoa) {
        pessoas.add(pessoa);
    }
    
    public void listar() {
        int cont = 1;
        for (String item : pessoas) {
            System.out.printf("%d. %s \n", cont++, item);
        }
    }

    public void remover(int posicao) {
        pessoas.remove(posicao - 1);
    }

    public void alterar(int posicao, String novoNome) {
        pessoas.set(posicao -1, novoNome);
    }


}



