package ExercicioDesafio1;

import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        IdadeCamila idadeCamila = new IdadeCamila();

        System.out.println("Informe a idade de Cibele:");
        int idadeCibele = sc.nextInt();

        System.out.println("Informe a idade de Camila:");
        int idadeC = sc.nextInt();

        System.out.println("Informe a idade de Celeste:");
        int idadeCeleste = sc.nextInt();

        int idadeDeCamila = idadeCamila.descobrirIdade(idadeCibele, idadeC, idadeCeleste);

        System.out.println("A idade de Camila é: " + idadeDeCamila);
        
    }

}
