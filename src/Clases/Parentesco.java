package Clases;
public class Parentesco {
    private int tipo;
    private Artista artista;
    
    public Parentesco(int parentesco, Artista artistaOrigen, Artista artistaDestino) {
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