import java.awt.*;

public class AutomovilDriver {
    public static void main(String[] args) {
        Automovil auto1 =new Automovil();
        Automovil auto2 = new Automovil();
        System.out.println("El auto es:");
        int edad=12;
        Automovil auto3 = new Automovil("VW", "Polo", (byte)15, Color.BLUE);
        System.out.println(auto3);
        Automovil auto4 = new Automovil();
        System.out.println(auto4);
        auto1.setMarca("Honda");
        System.out.println("La marca es:" + auto1.getMarca());

        auto1.setMarca("Una marca que no existe...");
        auto1.setMarca("Tesla");
        System.out.println("Fin");
    }

}
