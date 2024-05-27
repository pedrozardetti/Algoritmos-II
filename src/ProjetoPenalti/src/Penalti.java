public class Penalti {
    private int escolhaJogador;
    private int escolhaGoleiro;
    private String nomeJogador;
    private String nomeGoleiro;
    private boolean isGol;

    
    
    public Penalti(String nomeJogador, String nomeGoleiro) {
        this.nomeJogador = nomeJogador;
        this.nomeGoleiro = nomeGoleiro;
    }


    public int getEscolhaJogador() {
        return escolhaJogador;
    }

    public void setEscolhaJogador(int escolhaJogador) {
        this.escolhaJogador = escolhaJogador;
    }

    public int getEscolhaGoleiro() {
        return escolhaGoleiro;
    }

    public void setEscolhaGoleiro(int escolhaGoleiro) {
        this.escolhaGoleiro = escolhaGoleiro;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getNomeGoleiro() {
        return nomeGoleiro;
    }

    public void setNomeGoleiro(String nomeGoleiro) {
        this.nomeGoleiro = nomeGoleiro;
    }

    public boolean isGol() {
        return isGol;
    }

    public void setGol(boolean isGol) {
        this.isGol = isGol;
    }

}
