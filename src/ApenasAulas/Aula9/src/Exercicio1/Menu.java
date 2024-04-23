package Exercicio1;

import java.util.Scanner;

public class Menu {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    ControleReserva controle = new ControleReserva();
    
    int opcao = 0;
    
    do {
      System.out.println("\nMENU");
      System.out.println("1. Nova Reserva");
      System.out.println("2. Chamar Próximo");
      System.out.println("3. Listar Reservas");
      System.out.println("0. Sair");
      opcao = sc.nextInt();
      
      switch (opcao) {
        case 1:
        Reserva reserva = new Reserva();
        
        System.out.println("\nResponsável: ");
        String resp = sc.nextLine();
        reserva.responsavel = resp;
        
        System.out.println("\nLugares: ");
          int lugares = sc.nextInt();
          reserva.lugares = lugares;

          controle.novaReserva(reserva);
          break;

        case 2:
          System.out.println("\nResponsável: ");
          String resp2 = sc.nextLine();
          reserva.responsavel = resp2;

          System.out.println("\nLugares: ");
          int lugares2 = sc.nextInt();
          reserva.lugares = lugares;

          controle.proximo();

        case 3: 
          controle.listar();
          break;
      }

    } while (opcao != 0);
    System.out.println("Você saiu do programa :)");
  }
}
