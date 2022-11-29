package Exerc18Automovel;

public class CarroAutomatico extends Carro{

    public boolean freio;

    public CarroAutomatico(int numRodas, int velMax, int numDeCarros, boolean freio) {
        super(numRodas, velMax, numDeCarros);
        this.freio = freio;
    }

    public boolean isFreio() {
        return freio;
    }

    public void setFreio(boolean freio) {
        this.freio = freio;
    }

    public void ligarAutomovel () {
        if (freio) {
            setLigado(true);
            ligar();
        }

        else {
            setLigado(false);
            ligar();
        }

    }

}
