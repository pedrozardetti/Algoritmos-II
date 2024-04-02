package Pessoa;

class Pessoa {

  public String nome;
  public String cargo;
  public double salario;
  public String hobby;
  public double altura;
  public int idade;
  public double peso;

  public void apresentacao() {

    System.out.printf("Meu nome é >> %s\n", nome);
    System.out.printf("Meu cargo atual é >> %s\n", cargo);
    System.out.printf("Meu salário no momento é >> R$ %.2f\n", salario);
    System.out.printf("Meu hobby predileto é >> %s\n", hobby);
    System.out.printf("Tenho %.2f de altura, %2d anos e peso %.2fkg\n", altura, idade, peso);
  }

}
