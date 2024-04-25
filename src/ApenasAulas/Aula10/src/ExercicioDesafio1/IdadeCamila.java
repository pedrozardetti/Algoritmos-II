package ExercicioDesafio1;

import java.util.Arrays;

//https://olimpiada.ic.unicamp.br/pratique/pj/2021/f1/idade/

public class IdadeCamila {

    IdadesIrmas idadeIrmas = new IdadesIrmas();

    public int descobrirIdade(int idade1, int idade2, int idade3) {
        // Armazenamos as idades em um array
        int[] idades = {idade1, idade2, idade3};

        // Ordenamos as idades em ordem crescente
        Arrays.sort(idades);

        // A idade do meio é a idade de Camila
        int idadeDeCamila = idades[1];
        
        return idadeDeCamila;
    }
}
