package elementos;

public class Nodo {
     int elemento;
     Nodo siguiente;

    public Nodo(int elemento) {
        this.elemento = elemento;
    }
    public Nodo(int elemento, Nodo siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
    public int getElemento() {
        return elemento;
    }
    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    @Override
    public String toString() {
        return "Nodo{" +
                "elemeto=" + elemento +
                ", siguiente=" + siguiente +
                '}';
    }
}
