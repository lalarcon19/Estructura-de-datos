import datosPersona.ColaDatos;
import datosPersona.Persona;
import datosPersona.PilaDatos;
import elementos.ColaElementos;
import elementos.PilaElementos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ejercicio de elementos
        PilaElementos pila = new PilaElementos();
        ColaElementos cola = new ColaElementos();

        //ejercicio Datos de persona
        PilaDatos pilaDatos = new PilaDatos();
        ColaDatos colaDatos = new ColaDatos();

        double suma = 0;
        System.out.println("Ingresa la cantidad de numeros que deseas ingresar: ");
        int cantidad = scanner.nextInt();
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Ingresa el numero" + i + ":");
            int numero = scanner.nextInt();
            pila.apilar(numero);
            cola.encolar(numero);
            suma += numero;
        }

        double promedio = suma / cantidad;
        System.out.println("Los datos registrados en forma de pila son:\n" + pila.mostrarPila());
        System.out.println("Los datos registrados en forma cola son:\n" + cola.mostrarCola());
        System.out.println("EL promedio de los datos es:\n" + promedio);
        System.out.println("La cantidad de numeros pares registrado es:\n" + pila.cantidadPares());
        System.out.println(pila.ultimoElemento());
        System.out.println();

        System.out.println("Escriba el numero de personas que quiere ingresar: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println("Ingresa persona numero " + " " + i + ":");

            System.out.println("Codigo: ");
            int codigo = scanner.nextInt();

            System.out.println("Nombre: ");
            String nombre = scanner.next();

            System.out.println("Telefono:");
            String telefono = scanner.next();

            System.out.println("Edad:");
            int edad = scanner.nextInt();
            Persona persona = new Persona(codigo, nombre, telefono, edad);
            pilaDatos.ingresar(persona);
            colaDatos.ingresarPersona(persona);
        }

        System.out.println("Los elementos en la pila son: ");
        pilaDatos.mostrar();
        System.out.println();

        System.out.println("Pila depues de eliminar la persona");
        pilaDatos.desapilar();
        pilaDatos.mostrar();
        System.out.println();

        System.out.println("Los elementos en la cola son: ");
        colaDatos.mostrarColaPersonas();
        System.out.println();

        System.out.println("Lista despues de eliminar la persona de la cola: ");
        colaDatos.desencolocar();
        colaDatos.mostrarColaPersonas();
        System.out.println();

        System.out.println("El numero de personas en la lista es: " + pilaDatos.contar());

    }

}

