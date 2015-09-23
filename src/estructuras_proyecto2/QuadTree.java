package estructuras_proyecto2;

public class QuadTree {
    Nodo padre;

    public QuadTree() {
    }

    public QuadTree(Nodo padre) {
        this.padre = padre;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
}
