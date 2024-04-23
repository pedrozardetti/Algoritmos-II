package Exercicio1;

import java.util.ArrayDeque;
import java.util.Queue;

public class ControleReserva {
  
  private Queue<Reserva> reservas = new ArrayDeque<>();

  public void novaReserva(Reserva reserva) {

  }

  public void listar() {
    for (Reserva reserva : reservas) {
      System.out.println(reservas);
      
    }
  }

  public Reserva proximo() {
    reservas.peek();
    return;
  }







}
