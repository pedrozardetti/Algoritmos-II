package Aula3PT2;

class Boletim
{
    public double calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    
    public String verificarSituacao(double media, int faltas) {
        String sit = "";

        if (faltas > 4)
            sit = "DP Falta";
        else if (media < 6)
            sit = "DP Nota";
        else 
            sit = "Aprovado";

        return sit;
    }

}
