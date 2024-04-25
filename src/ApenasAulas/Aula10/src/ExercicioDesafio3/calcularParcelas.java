package ExercicioDesafio3;

public class CalcularParcelas {
    
    public void parcelas(int valorCompra, int numeroParcelas) {
    
        int parcelaBase = valorCompra / numeroParcelas;
        
        int resto = valorCompra % numeroParcelas;
        
        for (int i = 0; i < numeroParcelas; i++) {
            if (i < resto) {
                System.out.println(parcelaBase + 1);
            } else {
                System.out.println(parcelaBase);
            }
        }
    }
}
