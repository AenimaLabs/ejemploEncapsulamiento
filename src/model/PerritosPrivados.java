package model;

public class PerritosPrivados {


    private String nombre;
    private String raza;
    private String color;
    private int edad;

    public PerritosPrivados() {
    }

    public PerritosPrivados(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        //valida si el nombre ingresado no es null y no es vacío, de serlo el nombre pasa a ser NN
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "NN";

        }
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    @Override
    public String toString() {
        if (edad > 0) {
            return "Perrito: " + nombre + ", Raza: " + raza + ", Edad: " + edad + " años" + ", Color: " + color;
        } else {
            return "Perrito: " + nombre + ", Raza: " + raza + ", Color: " + color;
            // No se incluye la edad es menor que 0
        }
    }
}
