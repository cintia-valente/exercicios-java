package Exerc4Calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println("----------Menu---------");

        System.out.println();

        System.out.println("+ : soma");
        System.out.println("- : subtração");
        System.out.println("* : multiplicação");
        System.out.println("/ : divisão");

        Scanner teclado = new Scanner(System.in);

        System.out.println("\nInforme a operação desejada: ");
        String operacao = teclado.nextLine();
        
        determinaOperacao(operacao);
    }

    public static void determinaOperacao (String operacao) {
        double valor1 = 10;
        double valor2 = 5;

        switch (operacao) {
            case "+":
                System.out.println("Resultado = " + (valor1 + valor2));
                break;

            case "-":
                System.out.println("Resuldado = " + (valor1 - valor2));
                break;

            case "*":
                System.out.println("Resultado = " + (valor1 * valor2));
                break;

            case "/":
                System.out.println("Resultado = " + (valor1 / valor2));
                break;

            default:
                System.out.println("Operação inválida!!!");

        }

    }

}
