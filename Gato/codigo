import java.util.Scanner;

public class Recuadro {

    public static void main(String[] args) {

        int ancho = 5;
        int alto = 5;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digita solo X, O o _ : ");
        String entrada = input.nextLine();

        
        while (entrada.length() % 3 != 0) {
            entrada += "_";
        }

        // Se imprime el recuadro con los x y o 
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || i == alto - 1) {
                    System.out.print("-");
                } else if (j == 0 || j == ancho - 1) {
                    System.out.print("|");
                } else {
                    System.out.print(entrada.charAt((i-1)*3+j-1));
                }
            }
            System.out.println();
        }
    }
}
