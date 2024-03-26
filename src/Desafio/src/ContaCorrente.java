public class ContaCorrente {

    double saldo;
    int numero;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        } else
            System.out.println("O valor desejado é menor do que o mínimo aceito!");
        }


    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("O valor que você está tentando sacar é maior que o seu saldo!");
        } else
            saldo = saldo - valor;
    }

    public double verSaldo() {
        return saldo;
    }

}
