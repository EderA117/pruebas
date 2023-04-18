import java.awt.*;
import java.util.Random;

public class Automovil extends Vehiculo {
    protected String tipoUso;
    protected String numPuertaS;
    protected Color color;
    protected String capacidadMax;

    public Automovil() {
    }

    public Automovil(String tipo, String marca, String anio, String combustible, String modelo, String tipoUso, String numPuertaS, Color color, String capacidadMax) {
        super(tipo, marca, anio, combustible, modelo);
        this.tipoUso = tipoUso;
        this.numPuertaS = numPuertaS;
        this.color = color;
        this.capacidadMax = capacidadMax;
    }

    public String getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }

    public String getNumPuertaS() {
        return numPuertaS;
    }

    public void setNumPuertaS(String numPuertaS) {
        this.numPuertaS = numPuertaS;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(String capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "tipoUso='" + tipoUso + '\'' +
                ", numPuertaS='" + numPuertaS + '\'' +
                ", color=" + color +
                ", capacidadMax='" + capacidadMax + '\'' +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", anio='" + anio + '\'' +
                ", combustible='" + combustible + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
    public void abrir(){
        System.out.println("Se abrio las puertas del " + this.tipo);
    }
    public void cambiar(){
        System.out.println("Se cambiaron los rines del " + this.tipo);
    }
    public void alarma(){
        System.out.println("ALARMA!!!!!!!");
    }
}
