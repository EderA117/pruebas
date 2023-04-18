import java.awt.*;
import java.util.Scanner;

public class Taxi extends Automovil{
    private double tarifa;
    private String zonasHabiles;
    private boolean disponible;
    private double reputacion;

    public Taxi() {
    }

    public Taxi(String tipo, String marca, String anio, String combustible, String modelo, String tipoUso, String numPuertaS, Color color, String capacidadMax, double tarifa, String zonasHabiles, boolean disponible, double reputacion) {
        super(tipo, marca, anio, combustible, modelo, tipoUso, numPuertaS, color, capacidadMax);
        this.tarifa = tarifa;
        this.zonasHabiles = zonasHabiles;
        this.disponible = disponible;
        this.reputacion = reputacion;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public String getZonasHabiles() {
        return zonasHabiles;
    }

    public void setZonasHabiles(String zonasHabiles) {
        this.zonasHabiles = zonasHabiles;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getReputacion() {
        return reputacion;
    }

    public void setReputacion(double reputacion) {
        this.reputacion = reputacion;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "tarifa=" + tarifa +
                ", zonasHabiles='" + zonasHabiles + '\'' +
                ", disponible=" + disponible +
                ", reputacion=" + reputacion +
                ", tipoUso='" + tipoUso + '\'' +
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
    public void extender(){
        System.out.println("Su perimetro a aumentado 3 acaldias mas");
    }

    public void cambiarMode(String c){
        System.out.println("Ingrese el nuevo Modelo");
        Scanner de = new Scanner(System.in);
        c = de.nextLine();
        System.out.println("Su nuevo modelo de " + this.tipo + " cambio a " + c);
    }

    public void difeTipoUso(String d){
        System.out.println("Ingrese el nuevo Modelo");
        Scanner de = new Scanner(System.in);
        d = de.nextLine();
        System.out.println("Su nuevo modelo de " + this.tipo + " cambio a " + d);
    }

    public void calcularTarifa(double horaInicio, double horaFin) {
        double horasDeUso = horaFin - horaInicio;
        double tarifaBase = 8.74;
        double tarifaPorHora = 49.8;
        double tarifaTotal = tarifaBase + (horasDeUso * tarifaPorHora);
        if (horaInicio >= 23 && horaFin < 6) {
                // si la hora de inicio es a las 11 pm o después, o si la hora de fin es antes de las 6 am, se aplica una tarifa nocturna
            horasDeUso = horasDeUso +24;
            tarifaBase = 10.6;
            tarifaPorHora = 64.9;
            tarifaTotal = tarifaBase + (horasDeUso * tarifaPorHora);
            } else {
            tarifaTotal = tarifaBase + (horasDeUso * tarifaPorHora);
            }
        System.out.println("La tarifa es " + tarifaTotal);
        }
    }
