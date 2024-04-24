package ExercicioDesafio4;

public class calcularDistancia {
    
    int distanciaDiaria;
    public int calcularDistancia(int altura, int distanciaSobe, int distanciaDesce) {
        
        distanciaDiaria = distanciaSobe - distanciaDesce;

        int total = -1;
        int dias = -1 ;
        while (total < altura) {
            total += distanciaDiaria;
            dias++;
        }
        return dias;
        
    }
}
