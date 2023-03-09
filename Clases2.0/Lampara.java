package ico.fes;

import java.awt.*;

public class Lampara {
    private String tipoluz;
    private String material;
    private int alto;
    private int ancho;
    private Color color;

    public Lampara() {
    }

    public Lampara(String tipoluz, String material, int alto, int ancho, Color color) {
        this.tipoluz = tipoluz;
        this.material = material;
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
    }

    public String getTipoluz() {
        return tipoluz;
    }

    public void setTipoluz(String tipoluz) {
        this.tipoluz = tipoluz;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "tipoluz='" + tipoluz + '\'' +
                ", material='" + material + '\'' +
                ", alto=" + alto +
                ", ancho=" + ancho +
                ", color=" + color +
                '}';
    }

    public boolean encendida(){
        System.out.println("Esta encendida");
        return true;
    }
    public boolean bajaintensidad() {
        if (encendida() == true){
            System.out.println("Tiene baja intensidad ajustela");
    }
        return true;
    }
}
