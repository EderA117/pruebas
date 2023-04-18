import java.awt.*;

public class Main{
    public static void main(String[] args) {
        System.out.println("--------Vehiculo----------");
        Vehiculo ve = new Vehiculo("Tractocamion", "Mercedes", "2008", "Diesel", "Full");
        System.out.println(ve);
        ve.bajo();
        ve.rellenar();
        System.out.println("-------Automovil----------");
        Automovil auto = new Automovil("Vehiculo", "Wolskvagen", "2009", "Gas", "Jetta", "Personal", "4", Color.DARK_GRAY, "6");
        System.out.println(auto);
        auto.encender();
        auto.rellenar();
        auto.cambiar();
        System.out.println("--------------------Taxi--------------------");
        Taxi taxi = new Taxi("Vehiculo", "Nissan", "1984", "Gasolina", "Tsuru", "Transporte Publico", "4", Color.CYAN, "6", 8.74, "Chalco", true, 7.65);
        System.out.println(taxi);
        taxi.encender();
        taxi.rellenar();
        taxi.abrir();
        taxi.cambiarMode("wolskvagen");
        taxi.calcularTarifa(23,3);
    }
}