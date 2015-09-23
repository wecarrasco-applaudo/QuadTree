package Clases;
public class Pelicula {
    private String titulo;
    private int anno, numero;
    private String estudio;
    
    public Pelicula(int numero, String titulo, int ano, String estudio) {
        this.titulo = titulo;
        anno = ano;
        this.estudio = estudio;
        this.numero = numero;
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