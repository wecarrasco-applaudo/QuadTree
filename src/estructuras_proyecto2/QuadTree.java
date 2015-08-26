package estructuras_proyecto2;

public class QuadTree {
    Nodo padre;
    Nodo lista[] = new Nodo[4];

    public QuadTree() {
    }

    public QuadTree(Nodo padre, Nodo lista[]) {
        this.padre = padre;
        this.lista = lista;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
    
    public Nodo getElemento(int p){
        return lista[p];
    }
    
    public void setElemento(int p) {
        this.lista[p] = lista[p];
    }
    
    public Nodo[] getLista() {
        return lista;
    }

    public void setLista(Nodo[] lista) {
        this.lista = lista;
    }
}
