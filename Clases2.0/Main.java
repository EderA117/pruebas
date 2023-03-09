package ico.fes;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Pais pa = new Pais("Corea del Sur", "Seul", "Asiatico", "Coreano", "57.1Millones");
        System.out.println(pa);
        pa.dia();
        pa.onu();


        Giroscopio giro = new Giroscopio("Papel", 2, 2, 2);
        System.out.println(giro);
        giro.gira();

        Computadora pc = new Computadora("AMD", "Torre", "nvidia", "Asus", 16, 9);
        System.out.println(pc);
        pc.setProcesador("Sinic");
        pc.juega();

        CuboRubik cubo = new CuboRubik("Amariilo, rojo, azul, blanco,naranja,verde", 3, 3, "EUREKA", false);
        System.out.println(cubo);
        cubo.resuelto();

        Libro libro = new Libro("Java a Fondo", "ALFAOMEGA", 344, "Pablo Sznajdleder", false);
        System.out.println(libro);
        libro.leer();

        Balon bal = new Balon("NIKE", "Soccer", "Cuero", Color.RED);
        System.out.println(bal);
        bal.setDeporte("Tenis");
        bal.ponchado();

        Lampara lamp = new Lampara("Normal", "Metal", 20, 15, Color.CYAN);
        lamp.bajaintensidad();

        Gato gato = new Gato("Sombra", "F", 9, Color.BLACK);
        gato.mau();
        gato.suenio();
    }

}
