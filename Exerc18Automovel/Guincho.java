package Exerc18Automovel;

public class Guincho extends Automovel{

    int qtdMaxDeVeiculos;

    public Guincho(int numRodas, int velMax, int qtdMaxDeVeiculos) {
        super(numRodas, velMax);
        this.qtdMaxDeVeiculos = qtdMaxDeVeiculos;
    }

    public int getQtdMaxDeVeiculos() {
        return qtdMaxDeVeiculos;
    }

    public void setQtdMaxDeVeiculos(int qtdMaxDeVeiculos) {
        this.qtdMaxDeVeiculos = qtdMaxDeVeiculos;
    }

}
