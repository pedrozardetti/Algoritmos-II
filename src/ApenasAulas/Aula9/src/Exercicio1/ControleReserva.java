package Exercicio1;

import java.util.ArrayDeque;
import java.util.Queue;

public class ControleReserva {
  
  private Queue<Reserva> reservas = new ArrayDeque<>();

  public void novaReserva(Reserva reserva) {
    reservas.offer(reserva); // Adiciona a reserva à fila
    System.out.println("Reserva feita para " + reserva.responsavel + " com " + reserva.lugares + " lugares.");
  }

  public void listar() {
    System.out.println("\n--- Lista de Reservas ---");
    for (Reserva reserva : reservas) {
      System.out.println("Responsável: " + reserva.responsavel + ", Lugares: " + reserva.lugares);
    }
  }

  public void proximo() {
    if (!reservas.isEmpty()) {
      Reserva proximaReserva = reservas.poll(); // Remove e retorna a próxima reserva
      System.out.println("\nChamando próxima reserva para " + proximaReserva.responsavel + " com " + proximaReserva.lugares + " lugares.");
    } else {
      System.out.println("\nNão há reservas no momento.");
    }
  }
}

