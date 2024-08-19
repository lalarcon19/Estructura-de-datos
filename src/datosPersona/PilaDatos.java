package datosPersona;

import java.util.Stack;

public class PilaDatos {
     Stack<Persona> personas = new Stack();

    public void ingresar(Persona persona) {
        personas.push(persona);
    }
    public String desapilar (){
        if (personas.isEmpty()){
            System.out.println("La pila esta vacia");
            return null;
        }
        String pEliminada =  personas.remove(personas.size()-1).toString();
        return pEliminada;
    }
    public void mostrar(){
        for (int i = 0; i < personas.size(); i++){
            System.out.println(personas.get(i) + "");
        }
    }
    public int contar(){
        return personas.size();
    }

}
