class ResultadoRodada {
    private int golsJogador;
    private int golsGoleiro;
    private int defesasJogador;
    private int defesasGoleiro;

    public ResultadoRodada(int golsJogador, int golsGoleiro, int defesasJogador, int defesasGoleiro) {
        this.golsJogador = golsJogador;
        this.golsGoleiro = golsGoleiro;
        this.defesasJogador = defesasJogador;
        this.defesasGoleiro = defesasGoleiro;
    }

    public int getGolsJogador() {
        return golsJogador;
    }

    public int getGolsGoleiro() {
        return golsGoleiro;
    }

    public int getDefesasJogador() {
        return defesasJogador;
    }

    public int getDefesasGoleiro() {
        return defesasGoleiro;
    }
}

