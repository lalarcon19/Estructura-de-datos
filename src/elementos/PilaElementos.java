package elementos;

public class PilaElementos {
     Nodo cima;
     int tamano;
     int contador = 0;

    public PilaElementos() {
        this.cima = null;
        this.tamano=0;
    }
    //agregar elemnto
    public void apilar(int dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamano ++;
    }
    //Mostrar datos
    public String mostrarPila(){
        String salida = "";
        Nodo aux = cima;
        while (aux != null){
            salida += aux.getElemento() + "\n";
            aux = aux.getSiguiente();
        }
        return salida;
    }
    //Contar los pares
    public int cantidadPares(){
       Nodo actual = cima;
       while(actual != null){
           if(actual.elemento % 2 == 0) {
               contador++;
           }
           actual = actual.siguiente;
       }
       return  contador;
    }
    public String ultimoElemento(){
        return "El ultimo elemento ingresado es:\n" + cima.getElemento();
    }

    public boolean vacia(){
        return cima == null;
    }
    public String eliminar(){
        if (!vacia()){
            cima = cima.getSiguiente();
            tamano--;
        }
        return "El dato eliminado es: " + cima;
    }
}
