public class Vehiculo {
    public String marca;
    public String modelo;
    public int precio;
    private String matricula;

    public Vehiculo(String mar, String mod, int pre, String mat) {
        this.marca = mar;
        this.modelo = mod;
        this.precio = pre;
        this.matricula = mat;
    }

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("seat", "Ibiza", 12000, "1234abc");
        System.out.println("marca: " + v.marca);
        System.out.println("modelo: " + v.modelo);
        System.out.println("precio: " + v.precio);
        System.out.println("matricula: " + v.matricula);
    }
}