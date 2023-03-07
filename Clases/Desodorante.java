import java.util.ArrayList;

public class Desodorante {
    private String marca;
    private String aroma;
    private double precio;
    private int contenido;
    private boolean Antitranspirante;

    public Desodorante(){
    }

    public Desodorante(String marca, String aroma, double precio, int contenido, boolean antitranspirante) {
        this.marca = marca;
        this.aroma = aroma;
        this.precio = precio;
        this.contenido = contenido;
        Antitranspirante = antitranspirante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        ArrayList<String>       marcas = new ArrayList<>();
        marcas.add("rexona");
        marcas.add("axe");
        marcas.add("gillete");
        marcas.add("nivea");
        if (marcas.contains(marca.toLowerCase())){
        this.marca = marca;} else {
            System.out.println("No se reconoce flaco");
        }
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        ArrayList<String>       aromas = new ArrayList<>();
        aromas.add("fresh");
        aromas.add("chocolate");
        aromas.add("cool");
        aromas.add("cool wave");
        if (aromas.contains(aroma.toLowerCase())){
        this.aroma = aroma;} else System.out.println("Que olor es ese flaco");
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public boolean isAntitranspirante() {
        return Antitranspirante;
    }

    public void setAntitranspirante(boolean antitranspirante) {
        Antitranspirante = antitranspirante;
    }

    @Override
    public String toString() {
        return "Desodorante{" +
                "marca='" + marca + '\'' +
                ", aroma='" + aroma + '\'' +
                ", precio=" + precio +
                ", contenido=" + contenido +
                ", Antitranspirante=" + Antitranspirante +
                '}';
    }
}
