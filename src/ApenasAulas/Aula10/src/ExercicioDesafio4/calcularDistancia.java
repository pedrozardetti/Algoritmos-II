package ExercicioDesafio4;

public class CalcularDistancia {
    
    int distanciaDiaria;
    
    public int calcularDistancia(int altura, int distanciaSobe, int distanciaDesce) {
        
        distanciaDiaria = distanciaSobe - distanciaDesce;

        int total = 0;
        int dias = 0;
        
        while (total < altura) {
            total += distanciaSobe; // Dona Lesma sobe
            dias++;
            
            if (total >= altura) // Checar se já alcançou ou ultrapassou a altura
                break;
            
            total -= distanciaDesce; // Dona Lesma desce
        }
        
        return dias;
    }
}
