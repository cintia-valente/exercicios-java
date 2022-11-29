package Exerc16Emprestimo;

public class Emprestimo {

    private String data;
    private String hora;

    public Emprestimo (String data, String hora) {
        this.data = data;
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String toString() {
        return
                data + '\'' + hora;
    }
}
