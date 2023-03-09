package ico.fes;

import java.util.ArrayList;

public class Giroscopio {
    private String material;
    private double velocidadAngularX;
    private double velocidadAngularY;
    private double velocidadAngularZ;

    public Giroscopio() {
    }

    public Giroscopio(String material, double velocidadAngularX, double velocidadAngularY, double velocidadAngularZ) {
        this.material = material;
        this.velocidadAngularX = velocidadAngularX;
        this.velocidadAngularY = velocidadAngularY;
        this.velocidadAngularZ = velocidadAngularZ;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        ArrayList<String>       materiales = new ArrayList<>();
        materiales.add("Plastico");
        materiales.add("Metal");
        if (materiales.contains(material.toLowerCase())){
        this.material = material;
        } else {
            System.out.println("No existe eso bro");
        }
    }

    public double getVelocidadAngularX() {
        return velocidadAngularX;
    }

    public void setVelocidadAngularX(double velocidadAngularX) {
        this.velocidadAngularX = velocidadAngularX;
    }

    public double getVelocidadAngularY() {
        return velocidadAngularY;
    }

    public void setVelocidadAngularY(double velocidadAngularY) {
        this.velocidadAngularY = velocidadAngularY;
    }

    public double getVelocidadAngularZ() {
        return velocidadAngularZ;
    }

    public void setVelocidadAngularZ(double velocidadAngularZ) {
        this.velocidadAngularZ = velocidadAngularZ;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "material='" + material + '\'' +
                ", velocidadAngularX=" + velocidadAngularX +
                ", velocidadAngularY=" + velocidadAngularY +
                ", velocidadAngularZ=" + velocidadAngularZ +
                '}';
    }
    public boolean gira(){
        System.out.println("Gira y muy rapido");
        return true;
    }
    public boolean nogira(){
        System.out.println("Hazlo girar bro");
        return true;
    }
}
