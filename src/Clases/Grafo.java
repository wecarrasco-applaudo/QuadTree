package Clases;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
    
    public void addArtista(Artista a){
        artistas.add(a);
        //JOptionPane.showMessageDialog(null, a.getNombre()+" agregado con exito");
    }
    
    public int getCantidadArtistas(){
        return artistas.size();
    }
}