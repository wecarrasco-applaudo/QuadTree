package estructuras_proyecto2;
public class Nodo {
    public int x;
    public int y;
    public int height;
    public int width;
    public Nodo next;
    public Nodo hijo1;
    public Nodo hijo2;
    public Nodo hijo3;
    public Nodo hijo4;
    public Nodo() {
    }

    public Nodo(int x, int y, int height, int width, Nodo next) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.next = next;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
    
    
}
