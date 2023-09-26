import Individuo.*;

import coche.*;

public class App {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona("Ana","Lorca",2002);
        System.out.println("nombre: " + p1.nombre);
        System.out.println("ciudad: " + p1.ciudad);
        System.out.println("Edad: " + p1.obtenerFecha(2023) + " años");
        System.out.println("-------------------------");
        Persona p2 = new Persona("Antonio", "Huercal", 1967);
        System.out.println("nombre: " + p2.nombre);
        System.out.println("ciudad: " + p2.ciudad);
        System.out.println("Edad: " + p2.obtenerFecha(2023) + " años");
        System.out.println("-------------------------");
        Vehiculo v1 = new Vehiculo("Seat", "Ibiza", 12000, "1234qwe","Ana");
        System.out.println("nombre: " + p2.nombre);
        System.out.println("Marca: " + v1.marca);
        System.out.println("Modelo: " + v1.modelo);
        System.out.println("Precio: " + v1.precio);
        System.out.println("Matricula: " + v1.matricula);
        System.out.println("-------------------------");
        Vehiculo v2 = new Vehiculo("Toyota", "Corola", 40000, "1234asd", "Antonio");
        System.out.println("Marca: " + v2.marca);
        System.out.println("Modelo: " + v2.modelo);
        System.out.println("Precio: " + v2.precio);
        System.out.println("Matricula: " + v2.matricula);
    }
}