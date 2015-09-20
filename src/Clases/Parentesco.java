package Clases;
public class Parentesco {
    int tipo;
    Artista artista;
    public Parentesco(int parentesco, Artista artista) {
        this.tipo = parentesco;
        this.artista = artista;
    }
    public int getType() {
        return tipo;
    }
    public void setType(int type) {
        tipo = type;
    }
    public Artista getArtista() {
        return artista;
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}