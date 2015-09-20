package Clases;

public class Pelicula {
    String titulo;
    String ano;
    String estudio;

    public Pelicula(String titulo, String ano, String estudio) {
        this.titulo = titulo;
        this.ano = ano;
        this.estudio = estudio;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }


}
