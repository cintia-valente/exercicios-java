package Exerc16Emprestimo;

public class Projeto {

    public static void main(String[] args) {
        Pessoa usuario1 = new Pessoa("Maria", 25);
        Pessoa usuario2 = new Pessoa("João", 31);

        Livro livro1 = new Livro("O poder do hábito", "Autoajuda", "Charles Duhigg", true);
        Livro livro2 = new Livro("O Colecionador", "Terror", "John Fowles", true);
        Livro livro3 = new Livro("O Homem de Giz", "Ficção", "C.J. Tudor", false);

        Emprestimo emprestimo1 = new Emprestimo("20/11", "13:30");
        Emprestimo emprestimo2 = new Emprestimo("25/11", "14:30");

        System.out.println("--------Livros----------");
        System.out.println();
        System.out.println(livro1.toString());
        System.out.println(livro2.toString());
        System.out.println(livro3.toString());

        System.out.println();

        livro1.verificarStatus();
        livro2.verificarStatus();
        livro3.verificarStatus();

        System.out.println();

        System.out.println(emprestimo1.toString());
        System.out.println(emprestimo2.toString());

        System.out.println("Reservado por : " + usuario1.toString());
        System.out.println("Reservado por : " + usuario2.toString());

    }
}
