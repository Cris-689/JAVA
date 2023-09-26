package coche;

public class Vehiculo {
    public String marca;
    public String modelo;
    public int precio;
    public String matricula;
    public String propietario;

    public Vehiculo(String mar, String mod, int pre, String mat, String pro) {
        this.marca = mar;
        this.modelo = mod;
        this.precio = pre;
        this.matricula = mat;
        this.propietario = pro;
    }

    public static void main(String[] args) {
    }
}