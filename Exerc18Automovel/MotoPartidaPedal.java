package Exerc18Automovel;

public class MotoPartidaPedal extends Moto {

    private boolean acelerador;

    public MotoPartidaPedal(int numRodas, int velMax, int numDeCarros, boolean acelerador) {
        super(numRodas, velMax, numDeCarros);
        this.acelerador = acelerador;
    }

    public boolean isAcelerador() {
        return acelerador;
    }

    public void setAcelerador(boolean acelerador) {
        this.acelerador = acelerador;
    }

    public void ligarAutomovel() {
        if (acelerador) {
            setLigado(true);
            ligar();
        }

        else {
            setLigado(false);
            ligar();
        }
    }
}
