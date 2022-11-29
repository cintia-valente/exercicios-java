package Exerc18Automovel;

public class Projeto {

    public static void main(String[] args) {
        Automovel automovel = new Automovel(4, 200);
        CarroAutomatico carroAutomatico = new CarroAutomatico(4, 200, 3, true);
        MotoPartidaPedal motoPartidaPedal = new MotoPartidaPedal(4, 200, 5, true);
        Guincho guincho = new Guincho(4, 200, 10);

        carroAutomatico.ligarAutomovel();
        motoPartidaPedal.ligarAutomovel();

        int soma = (carroAutomatico.getNumDeCarros() + motoPartidaPedal.getNumDeMotos());

        if (soma <= guincho.getQtdMaxDeVeiculos()) {
            System.out.println("É possível carregar todos os automóveis!");
        } else
            System.out.println("Não é possível carregar os automóveis!");
    }
}
