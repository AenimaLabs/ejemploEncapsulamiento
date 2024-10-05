package main;

import model.GatitosPublicos;
import model.PerritosPrivados;

public class Main {
    public static void main(String[] args) {

        // voy a crear un gatito del tipo de clase GatitosPublicos
        //se puede acceder directamente al atributo dado que están definidos como públicos
        GatitosPublicos gatito1 = new GatitosPublicos(); //creando un gatito mediante el constructor vacío
        gatito1.nombre = "Abelardo";
        gatito1.raza = "Siamés";
        gatito1.color = "Blanco";
        gatito1.edad = 5;

       gatito1.mostrarInfo();

        //hasta acá bien, pero qué pasa si algún chistoso le ingresa una edad no válida a un gatito?
        //por ejemplo:
        //gatito1.edad = -17;
        //no tenemos control sobre eso y la idea de la encapsulación es validar o filtrar los valores antes de asignarlos
        //(entre otros usos de seguridad, escalabilidad, etc)

        //creo otro gatito, que no tendrá nombre y la edad será -7
        GatitosPublicos gatito2 = new GatitosPublicos();
        gatito2.nombre = "";
        gatito2.raza = "Romano";
        gatito2.color = "Verde";
        gatito2.edad = -500;

        gatito2.mostrarInfo();

        // voy a crear un perrito del tipo de clase PerritosPrivados
        //no puedo acceder a modificar los atributos directamente
        //los modifico o los leo mediante el uso de set (modificar) y get (leer)

        PerritosPrivados perrito1 = new PerritosPrivados(); //creando un perrito mediante constructor vacío

        perrito1.setNombre("Snoop");
        perrito1.setRaza("Cane Corso");
        perrito1.setColor("Negro");
        perrito1.setEdad(5);

        // si intento
        // perrito1.nombre = "Snoop";
        // me dará error, ya que ese atributo en la clase de PerritosPrivados se declaró como privado

        //imprime la información guardada en el método toString
        System.out.println(perrito1.toString());

        PerritosPrivados perrito2 = new PerritosPrivados(); //creando otro perrito mediante constructor vacío

        //acá intentaremos trolear al programa
         //tiene un null como nombre y tendrá una edad imposible
        perrito2.setNombre(null);
        perrito2.setRaza("Doberman");
        perrito2.setColor("Negro");
        perrito2.setEdad(-99); // edad imposible

        //imprimo mi segundo perrito (que no tiene nombre ni edad válida)
        //si el nombre está vacío o es null lo reemplaza por un NN, y si la edad es imposible, la deja en 0 y no la publica
        //estas validaciones se realizan en los setters y en toString de PerritosPrivados
        System.out.println(perrito2.toString());

        //***************
        //OJO
        //las validaciones de edad y nombre pasan en setEdad, setNombre y toString

        //creo otro perrito con el constructor por parámetros
        //acá no uso los setters para agregar la información
        PerritosPrivados perrito3 = new PerritosPrivados(null, "Quiltro", "Naranjo", -16);
        System.out.println(perrito3.toString());

        System.out.println(perrito2.getEdad());
        //la edad del perrito2 es -99, pero lo imprime como 0
        //¿por qué pasa eso?
        //el valor predeterminado para un int en java es 0
        //al entrar en el setEdad y no cumplir con la condición, no varía su valor por defecto
        //sólo se modifica la edad si es que esta es mayor a 0
    }
}
