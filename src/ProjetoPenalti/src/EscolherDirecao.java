public class EscolherDirecao {

    public void informarNome(Penalti penalti) {
        System.out.println("\nEntão, nosso camisa 10 será --> " + penalti.getNomeJogador());
        System.out.println("\nE isso quer dizer que a nossa muralha vai ser --> " + penalti.getNomeGoleiro());
    }

    public boolean isGol(Penalti penalti) {
        if (penalti.getEscolhaJogador() != penalti.getEscolhaGoleiro()) {
            System.out.println("É GOOOOOOOOOL!!");
            AudioPlayer.playGolSound();
            return true;
        } else {
            System.out.println("DEFEEEEEEESA!!!");
            AudioPlayer.playDefesaSound();
            return false;
        }
    }
}

