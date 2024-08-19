package datosPersona;

public class Persona {
   int codigo;
   String nombre;
   String telefono;
   int edad;

    public Persona(int codigo, String nombre, String telefono, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }
}
