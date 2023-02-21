import java.util.Scanner;
public class DatoString{
    public static void main(String[] args) {
        String[] separacion;
        System.out.println("Introduzca nombre profesion y pais con un espacio de separacion entre palabara");
        Scanner ingreso = new Scanner(System.in);
        String input = "";
        input = ingreso.nextLine();
        separacion = input.split(" ");
        for(int i=0;i<separacion.length; i++){}
        System.out.println("Nombre= "+ separacion[0].toUpperCase());
        System.out.println("Profesion= " + separacion[1].toUpperCase());
        System.out.println("Pais= "+ separacion[2].toUpperCase());
    }
}