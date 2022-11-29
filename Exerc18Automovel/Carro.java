package Exerc18Automovel;

public class Carro extends Automovel{

    private int numDeCarros;
    public Carro(int numRodas, int velMax, int numDeCarros) {
        super(numRodas, velMax);
        this.numDeCarros = numDeCarros;
    }

    public int getNumDeCarros() {
        return numDeCarros;
    }

    public void setNumDeCarros(int numDeCarros) {
        this.numDeCarros = numDeCarros;
    }
}
