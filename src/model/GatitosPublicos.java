package model;

public class GatitosPublicos {

    public String nombre;
    public String raza;
    public String color;
    public int edad;

    //al estar los atributos como públicos, puedo acceder a ellos directamente desde otra clase

    // Método para mostrar la información del gatito
    public void mostrarInfo() {
        System.out.println("Gatito: " + nombre + ", Raza: " + raza + ", Color: " + color + ", Edad: " + edad + " años.");
    }

}
