package Clases;
import java.util.ArrayList;
public class Artista {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private ArrayList<Pelicula> peliculas;
    private ArrayList<Parentesco> parentescos;
    
    public Artista(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        peliculas = new ArrayList();
        parentescos = new ArrayList();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    //Parentescos
    public ArrayList<Parentesco> getParentescos() {
        return parentescos;
    }
    public Parentesco getParentesco(int i){
        if(i>=0 && i<parentescos.size()){
            return parentescos.get(i);
        }
        return null;
    }
    public void setParentescos(ArrayList<Parentesco> parentesco) {
        this.parentescos = parentesco;
    }
    public void addParentesco(int type, Artista a){
        if(type>=0 && type<=3){
            parentescos.add(new Parentesco(type, a));
            a.addParentesco2(type, this);
            System.out.println("Parentesco agregado.");
        }else{
            System.out.println("Parentesco no agregado.");
        }
    }
    public void addParentesco2(int type, Artista a){
        parentescos.add(new Parentesco(type,a));
    }
    public void removeParentesco(int i){
        if(i>=0 && i<parentescos.size()){
            parentescos.get(i).getArtista().removeParentesco(this);
            parentescos.remove(i);
            System.out.println("Parentesco removido.");
        }
    }
    public void removeParentesco(Artista a){
        for(int i=0; i<parentescos.size(); i++){
            if(parentescos.get(i).getArtista().equals(a)){
                parentescos.remove(i);
                break;
            }
        }
    }
    
    //Peliculas
    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }
    public Pelicula getPelicula(int i){
        if(i>=0 && i<peliculas.size()){
            return peliculas.get(i);
        }
        return null;
    }
    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    public void addPelicula(Pelicula p){
        peliculas.add(p);
        System.out.println("Pelicula agregada.");
    }
    public void removePelicula(int i){
        if(i>=0 && i<peliculas.size()){
            peliculas.remove(i);
        }
    }
    
    @Override
    public String toString(){
       return nombre; 
    }
}
