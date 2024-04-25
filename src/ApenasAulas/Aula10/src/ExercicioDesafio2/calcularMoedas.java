package ExercicioDesafio2;

//https://olimpiada.ic.unicamp.br/pratique/p1/
public class CalcularMoedas {
    
    public int calcularMarinheiro(int moedas, int marinheiros) {
        // O número total de pessoas (incluindo o Capitão) é o número de marinheiros mais 1
        int totalPartes = marinheiros + 2;
        
        // O número de moedas que cada pessoa (exceto o Capitão) recebe é o total de moedas dividido pelo total de pessoas, menos o Capitão
        int moedasPorPessoa = moedas / totalPartes;
        
        // O número de moedas que o Capitão recebe é o dobro do número de moedas que uma pessoa (exceto o Capitão) recebe
        int moedasDoCapitao = moedasPorPessoa * 2;
        
        return moedasDoCapitao;
    }
}
