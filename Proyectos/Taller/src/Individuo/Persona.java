package Individuo;

public class Persona {
    private int fnac =2000;
    public String nombre;
    public String ciudad;

    public Persona(String nom, String ciu, int fecha){
        // metodo contructor ...  p = new Persona('Ana', 'Almeria', 2018)
        this.nombre = nom;
        this.ciudad = ciu;
        this.fnac = fecha;
    }
    // metodos get/set getters/setters

    // metodos que operan sobre atributos para realizar calculos
    public int obtenerFecha(int anioAct){
        int edad = 0;
        edad = anioAct - this.fnac;
        return edad;
    }
    //metodo main --> comienza a ejecutar la clase
    public static void main(String[] args){
    }
}