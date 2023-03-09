package ico.fes;

import java.awt.*;

public class Gato {
    private String nombre;

    private String genero;
    private int edad;
    private Color color;

    public Gato() {
    }

    public Gato(String nombre, String genero, int edad, Color color) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                ", color=" + color +
                '}';
    }
    public boolean mau(){
        System.out.println("Esta maullando!!!!");
        return true;
    }
    public boolean sucio(){
        System.out.println("Esta sucio banialo");
        return true;
    }
    public boolean suenio(){
        System.out.println("Tiene sueño dejalo dormir en TU cama");
        return true;
    }
}
