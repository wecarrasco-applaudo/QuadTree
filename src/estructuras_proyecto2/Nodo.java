package estructuras_proyecto2;
public class Nodo {
    Punto value;
    public int height;
    public int width;
    public Nodo nw;
    public Nodo ne;
    public Nodo sw;
    public Nodo se;

    public Nodo() {
    }

    public Nodo(Punto value, int height, int width, Nodo nw, Nodo ne, Nodo sw, Nodo se) {
        this.value = value;
        this.height = height;
        this.width = width;
        this.nw = nw;
        this.ne = ne;
        this.sw = sw;
        this.se = se;
    }

    public Punto getValue() {
        return value;
    }

    public void setValue(Punto value) {
        this.value = value;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Nodo getNw() {
        return nw;
    }

    public void setNw(Nodo nw) {
        this.nw = nw;
    }

    public Nodo getNe() {
        return ne;
    }

    public void setNe(Nodo ne) {
        this.ne = ne;
    }

    public Nodo getSw() {
        return sw;
    }

    public void setSw(Nodo sw) {
        this.sw = sw;
    }

    public Nodo getSe() {
        return se;
    }

    public void setSe(Nodo se) {
        this.se = se;
    }  
}