package Exerc16Emprestimo;

public class Livro {

    private String titulo;
    private String genero;
    private String autor;
    private boolean status;

    public Livro (String titulo, String genero, String autor, boolean status) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setNome(String nome) {
        this.titulo = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setReserva(boolean reservado) {
        this.status = status;
    }

    public String toString () {
        return
                titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", autor='" + autor + '\'' +
                ", status=" + status;
    }

    public void verificarStatus () {
        if (status) {
            System.out.println("Livro já possui reservas!");
        } else
            System.out.println("Empréstimo realizado com sucesso!");
    }

}
