package Clases;
import java.util.ArrayList;
public class Artista {
    String nombre;
    int edad;
    String nacionalidad;
    ArrayList<Pelicula> peliculas;
    ArrayList<Parentesco> parentescos;
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
        return parentesco;
    }
    public Parentesco getParentesco(int i){
        //TODO
    }
    public void setParentescos(ArrayList<Parentesco> parentesco) {
        this.parentescos = parentesco;
    }
    public void addParentesco(int type, Artista a){
        if(type>=0 && type<=3){
            parentescos.add(new Parentesco(type, a));
            System.out.println("Parentesco agregado.");
        }else{
            System.out.println("Parentesco no agregado.");
        }
    }
    public void removeParentesco(int i){
        //TODO
    }
    public void removeParentesco(Artista a){
        //TODO
    }
    
    //Peliculas
    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }
    public Pelicula getPelicula(int i){
        //TODO
    }
    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    public void addPelicula(Pelicula p){
        peliculas.add(p);
        System.out.println("Pelicula agregada.");
    }
    public void removePelicula(int i){
        //TODO
    }
}
