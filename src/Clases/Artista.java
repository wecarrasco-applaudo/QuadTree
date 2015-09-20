package Clases;

import java.util.ArrayList;
import javax.print.event.PrintJobEvent;
import javax.swing.JOptionPane;

public class Artista {
    String nombre;
    int edad;
    String nacionalidad;
    ArrayList<Pelicula> peliculas = new ArrayList<>();
    ArrayList<Parentesco> parentesco = new ArrayList<>();

    public Artista() {
    }

    public Artista(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
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

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public ArrayList<Parentesco> getParentesco() {
        return parentesco;
    }

    public void setParentesco(ArrayList<Parentesco> parentesco) {
        this.parentesco = parentesco;
    }
    
    public void addPelicula(Pelicula p){
        peliculas.add(p);
        JOptionPane.showMessageDialog(null, "Pelicula Agregada");
    }
    
    public void addParentesco(String p, Artista a){
        if (p.contentEquals("Familia")) {
            parentesco.add(new Parentesco(1, a));
        }else if (p.contentEquals("Noviazgo")) {
            parentesco.add(new Parentesco(2, a));
        }else if (p.contentEquals("Matrimonio")) {
            parentesco.add(new Parentesco(3, a));
        }else if (p.contentEquals("Amistad")) {
            parentesco.add(new Parentesco(4, a));
        }
        
        JOptionPane.showMessageDialog(null, "Parentesco Agregado");
    }
}
