package Pessoa;

import java.util.Scanner;

public class App {

  public static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {

    Pessoa pessoa = new Pessoa();

    System.out.println("--> PROGRAMA DE APRESENTAÇÃO <--");
    System.out.println("Informe o seu nome");
    pessoa.nome = sc.nextLine();
    System.out.println("Informe o seu cargo na empresa");
    pessoa.cargo = sc.nextLine();
    System.out.println("Informe o seu salário atual");
    pessoa.salario = sc.nextDouble();
    System.out.println("Informe o seu hobby predileto");
    pessoa.hobby = sc.next();
    System.out.println("Informe sua altura");
    pessoa.altura = sc.nextDouble();
    System.out.println("Informe sua idade");
    pessoa.idade = sc.nextInt();
    System.out.println("Informe seu peso");
    pessoa.peso = sc.nextDouble();

    pessoa.apresentacao();

  }

}
