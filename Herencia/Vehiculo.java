public class Vehiculo {
    protected String tipo;
    protected String marca;
    protected String anio;
    protected String combustible;
    protected String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String marca, String anio, String combustible, String modelo) {
        this.tipo = tipo;
        this.marca = marca;
        this.anio = anio;
        this.combustible = combustible;
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", anio='" + anio + '\'' +
                ", combustible='" + combustible + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
    public boolean encender(){
        System.out.println("Se encendio el " + this.tipo );
        return true;
    }

    public boolean bajo(){
        System.out.println("Tiene poco " + this.combustible + "Vaya a rellenar...");
        return true;
    }
    public boolean rellenar(){
        if (bajo()==true){
            System.out.println("Llenando el " + this.tipo + " de " + this.combustible);
            return true; }
        else System.out.println("Esta lleno");
        return false;
    }
}
