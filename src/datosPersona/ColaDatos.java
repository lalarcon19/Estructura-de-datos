package datosPersona;

import java.util.LinkedList;
import java.util.Queue;

public class ColaDatos {
    Queue<Persona> personas = new LinkedList<>();

    public Queue<Persona> getPersonas() {
        return personas;
    }
    public void setPersonas(Queue<Persona> personas) {
        this.personas = personas;
    }
    public void ingresarPersona(Persona persona) {
        personas.add(persona);
    }
    public String desencolocar() {
        if (personas.isEmpty()) {
            System.out.println("La cola esta vacia");
            return null;
        }
        String personaEliminada = personas.poll().toString();
        return personaEliminada;
    }
    public void mostrarColaPersonas() {
        for (Persona persona : personas) {
            System.out.println("Las personas en la cola son: " + persona + " ");
        }
    }
}
