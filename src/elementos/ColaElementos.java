package elementos;

public class ColaElementos {
    private Nodo inicio;
    private Nodo fin;
    private int cantidad;

    public ColaElementos(){
        this.inicio = null;
        this.fin = null;
        this.cantidad=0;
    }
    public Nodo getInicio() {
        return inicio;
    }
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    public Nodo getFin() {
        return fin;
    }
    public void setFin(Nodo fin) {
        this.fin = fin;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public boolean vacia(){
        return inicio == null && fin == null;
    }
    public void encolar(int dato){
        if(vacia()){
            inicio = fin = new Nodo(dato, null);
        }else {
            Nodo nuevo = new Nodo(dato, null);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        cantidad ++;
    }

    public String mostrarCola(){
        String salida = "";
        if (!vacia()){
            Nodo aux = inicio;
            while(aux!=null){
                salida += aux.getElemento()+"\n";
                aux = aux.getSiguiente();
            }
        }
        return salida;
    }
}
