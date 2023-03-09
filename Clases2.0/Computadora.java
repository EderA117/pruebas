package ico.fes;

import java.util.ArrayList;

public class Computadora {
    private String procesador;
    private String tipodeCase;
    private String marcaGrafica;
    private String marcaMonitor;
    private int memoriaRam;
    private int numPerifericos;

    public Computadora() {
    }

    public Computadora(String procesador, String tipodeCase, String marcaGrafica, String marcaMonitor, int memoriaRam, int numPerifericos) {
        this.procesador = procesador;
        this.tipodeCase = tipodeCase;
        this.marcaGrafica = marcaGrafica;
        this.marcaMonitor = marcaMonitor;
        this.memoriaRam = memoriaRam;
        this.numPerifericos = numPerifericos;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        ArrayList<String>       procesadores = new ArrayList<>();
        procesadores.add("AMD");
        procesadores.add("INTEL");
        if (procesadores.contains(procesador.toUpperCase())) {
            this.procesador = procesador;
        } else {
            System.out.println("No lo conozco");
        }
    }

    public String getTipodeCase() {
        return tipodeCase;
    }

    public void setTipodeCase(String tipodeCase) {
        ArrayList<String>       Case = new ArrayList<>();
        Case.add("MICRO ATX");
        Case.add("TORRE");
        if (Case.contains(tipodeCase.toUpperCase())) {
            this.tipodeCase = tipodeCase;
        } else {
            System.out.println("Apoco hay mas");
        }
    }

    public String getMarcaGrafica() {
        return marcaGrafica;
    }

    public void setMarcaGrafica(String marcaGrafica) {
        ArrayList<String>       graficas = new ArrayList<>();
        graficas.add("NVIDIA");
        graficas.add("ASUS");
        graficas.add("GIGABYTE");
        graficas.add("AMD");
        graficas.add("MSI");
        graficas.add("ZOTAC");
        if (graficas.contains(marcaGrafica.toLowerCase())) {
            this.marcaGrafica = marcaGrafica;
        } else {
            System.out.println("No la ubico");
        }
    }

    public String getMarcaMonitor() {
        return marcaMonitor;
    }

    public void setMarcaMonitor(String marcaMonitor) {
        this.marcaMonitor = marcaMonitor;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getNumPerifericos() {
        return numPerifericos;
    }

    public void setNumPerifericos(int numPerifericos) {
        this.numPerifericos = numPerifericos;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "procesador='" + procesador + '\'' +
                ", tipodeCase='" + tipodeCase + '\'' +
                ", marcaGrafica='" + marcaGrafica + '\'' +
                ", marcaMonitor='" + marcaMonitor + '\'' +
                ", memoriaRam=" + memoriaRam +
                ", numPerifericos=" + numPerifericos +
                '}';
    }
    public boolean encendida(){
        System.out.println("Se prendio la Pc");
        return true;
    }
    public boolean musica(){
        System.out.println("Esta escuchando: Faith de The Weeknd");
        return true;
    }
    public boolean juega(){
        if (musica() == true){
            System.out.println("Juega meintras escucha musica");
        }
        return true;
    }
    public boolean camara(){
        System.out.println("Esta apagada");
        return true;
    }
}
