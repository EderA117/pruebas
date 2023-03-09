package ico.fes;

import java.util.ArrayList;

public class CuboRubik {
    private String colores;
    private int largo;
    private int ancho;
    private String Marca;
    private boolean dificil;

    public CuboRubik() {
    }

    public CuboRubik(String colores, int largo, int ancho, String marca, boolean dificil) {
        this.colores = colores;
        this.largo = largo;
        this.ancho = ancho;
        Marca = marca;
        this.dificil = dificil;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        ArrayList<String>       marcas = new ArrayList<>();
        marcas.add("EUREKA");
        marcas.add("RUBIKS");
        marcas.add("CONGOS DESIGN");
        marcas.add("ESCAPE WELT");
        marcas.add("PEAK CUBE");
        if (marcas.contains(marca.toUpperCase())) {
            this.Marca = marca;
        } else {
            System.out.println("No es famosa");
        }
    }

    public boolean isDificil() {
        return dificil;
    }

    public void setDificil(boolean dificil) {
        this.dificil = dificil;
    }

    @Override
    public String toString() {
        return "CuboRubik{" +
                "colores='" + colores + '\'' +
                ", largo=" + largo +
                ", ancho=" + ancho +
                ", Marca='" + Marca + '\'' +
                ", dificil=" + dificil +
                '}';
    }
    public boolean resuelto(){
        System.out.println("Felicidades lo resolviste!!!");
        return true;
    }
    public boolean noresuelto(){
        System.out.println("Sigue esfozandote!!!");
        return false;
    }

}
