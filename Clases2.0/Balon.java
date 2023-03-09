package ico.fes;

import java.awt.*;
import java.util.ArrayList;

public class Balon {
    private String marca;
    private String deporte;
    private String material;
    private Color color;

    public Balon() {
    }

    public Balon(String marca, String deporte, String material, Color color) {
        this.marca = marca;
        this.deporte = deporte;
        this.material = material;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        ArrayList<String>       depo = new ArrayList<>();
        depo.add("americano");
        depo.add("soccer");
        if (depo.contains(deporte.toLowerCase())) {
            this.deporte = deporte;
        } else {
            System.out.println("Nose de que habalas");
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "marca='" + marca + '\'' +
                ", deporte='" + deporte + '\'' +
                ", material='" + material + '\'' +
                ", color=" + color +
                '}';
    }
    public boolean bota(){
        System.out.println("Esta botando");
        return true;
    }
    public boolean ponchado(){
        System.out.println("Esta ponchado");
        return true;
    }
}
