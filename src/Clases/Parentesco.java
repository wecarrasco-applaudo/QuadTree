package Clases;
public class Parentesco {
    int parentesco;
    Artista artista;

    public Parentesco() {
    }

    public Parentesco(int parentesco, Artista artista) {
        this.parentesco = parentesco;
        this.artista = artista;
    }

    public int getParentesco() {
        return parentesco;
    }

    public void setParentesco(int parentesco) {
        this.parentesco = parentesco;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    
}
