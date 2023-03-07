import java.util.ArrayList;

public class Monitor {
    private int pulgadas;
    private String marca;
    private String modelo;
    private String tipo;
    private double precio;

    public Monitor(){
    }

    public Monitor(int pulgadas, String marca, String modelo, String tipo, double precio) {
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        ArrayList<Integer>          pulgada = new ArrayList<Integer>();
        pulgada.add(Integer.valueOf("18"));
        pulgada.add(Integer.valueOf("21"));
        pulgada.add(Integer.valueOf("24"));
        pulgada.add(Integer.valueOf("27"));
        pulgada.add(Integer.valueOf("32"));
        if (pulgada.contains(pulgadas)) {
            this.pulgadas = pulgadas;
        } else {System.out.println("O muy chica o muy grande pero no se vale");}
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        ArrayList<String>       marcas = new ArrayList<String>();
        marcas.add("DELL");
        marcas.add("ASUS");
        marcas.add("LG");
        marcas.add("RAZER");
        marcas.add("GIGABYTE");
        if (marcas.contains(marca.toUpperCase())) {
            this.marca = marca;
        } else {System.out.println("No la tenemos, solo calidad");}
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo= modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        ArrayList<String>       tipos = new ArrayList<>();
        tipos.add("LED");
        tipos.add("IPS");
        if (tipos.contains(tipo.toLowerCase())){
        this.tipo = tipo;}
        else {System.out.println("Nose de que hables");}
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio==3000 && precio<=15000){
        this.precio = precio;}
        else {System.out.println("O muy barato o muy caro");}
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "pulgadas=" + pulgadas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
