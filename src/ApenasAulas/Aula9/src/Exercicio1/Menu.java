package Exercicio1;

import java.util.Scanner;

public class Menu {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    ControleReserva controle = new ControleReserva();
    
    int opcao;
    
    do {
      System.out.println("\nMENU");
      System.out.println("1. Nova Reserva");
      System.out.println("2. Chamar Próximo");
      System.out.println("3. Listar Reservas");
      System.out.println("0. Sair");
      opcao = Integer.parseInt(sc.nextLine());
      
      switch (opcao) {
        case 1:
          Reserva reserva = new Reserva();
        
          System.out.println("\nResponsável: ");
          String resp = sc.nextLine();
          reserva.responsavel = resp;
        
          System.out.println("\nLugares: ");
          int lugares = Integer.parseInt(sc.nextLine());
          reserva.lugares = lugares;

          controle.novaReserva(reserva);
          break;

        case 2:
          controle.proximo();
          break;

        case 3: 
          controle.listar();
          break;
      }

    } while (opcao != 0);
    System.out.println("Você saiu do programa :)");
  }
}
