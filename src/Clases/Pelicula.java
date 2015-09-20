package Clases;
public class Pelicula {
    String titulo;
    int anno;
    String estudio;
    public Pelicula(String titulo, int ano, String estudio) {
        this.titulo = titulo;
        anno = ano;
        this.estudio = estudio;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public String getStudio() {
        return estudio;
    }
    public void setStudio(String estudio) {
        this.estudio = estudio;
    }
}