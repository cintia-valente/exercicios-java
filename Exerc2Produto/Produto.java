package Exerc2Produto;

import java.util.Scanner;

public class Produto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome do produto: ");
        String nome = teclado.nextLine();

        System.out.println("Informe o preço do produto: ");
        double preco = teclado.nextDouble();

        System.out.println("Informe a quantidade de produto: ");
        int quantidade = teclado.nextInt();

        calculaValorTotal(nome, preco, quantidade);

    }

    public static void calculaValorTotal (String nome, double preco, int quantidade) {
        double valorSemDesconto;
        double valorComDesconto;
        double total;

        if (quantidade <= 10) {
            valorSemDesconto = preco * quantidade;

            System.out.println("Produto: " + nome);
            System.out.println("Total a ser pago: " + valorSemDesconto);

        } else if (quantidade <= 20) {
            valorSemDesconto = preco * quantidade;
            valorComDesconto = valorSemDesconto * 0.10;

            total = valorSemDesconto - valorComDesconto;

            System.out.println("Produto: " + nome);
            System.out.println("Total a ser pago: " + total);

        } else if (quantidade <= 50) {
            valorSemDesconto = preco * quantidade;
            valorComDesconto = valorSemDesconto * 0.20;

            total = valorSemDesconto - valorComDesconto;

            System.out.println("Produto: " + nome);
            System.out.println("Total a ser pago: " + total);

        } else {
            valorSemDesconto = preco * quantidade;
            valorComDesconto = valorSemDesconto * 0.25;

            total = valorSemDesconto - valorComDesconto;

            System.out.println("Produto: " + nome);
            System.out.println("Total a ser pago: " + total);
        }
    }

}
