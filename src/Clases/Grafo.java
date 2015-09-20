package Clases;
import java.util.ArrayList;
public class Grafo {
    private ArrayList<Artista> artistas;
    public Grafo(){
        artistas=new ArrayList();
        //Add Kevin Bacon
        artistas.add(new Artista("Kevin Bacon", 57, "United States"));
    }
    public ArrayList<Artista> getArtistas() {
        return artistas;
    }
    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }
    
}