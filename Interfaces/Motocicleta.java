public class Motocicleta implements Vehiculo{

    private int cmCubicos;
    private String marca;

    public Motocicleta() {
    }

    public Motocicleta(int cmCubicos, String marca) {
        this.cmCubicos = cmCubicos;
        this.marca = marca;
    }

    public int getCmCubicos() {
        return cmCubicos;
    }

    public void setCmCubicos(int cmCubicos) {
        this.cmCubicos = cmCubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cmCubicos=" + cmCubicos +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void hacercaballito(){
        System.out.println("Haciendo caballito y me caigo por wey");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la mamalona de " + this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("La apague porque ya llegue al Shine");
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando con la moto de " + this.cmCubicos + " CC");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando......");
    }
}
