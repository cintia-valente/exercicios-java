package Exerc18Automovel;

public class Moto extends Automovel{

    private int numDeMotos;
    public Moto(int numRodas, int velMax, int numDeMotos) {
        super(numRodas, velMax);
        this.numDeMotos = numDeMotos;
    }

    public int getNumDeMotos() {
        return numDeMotos;
    }

    public void setNumDeMotos(int numDeMotos) {
        this.numDeMotos = numDeMotos;
    }
}
