public class Recuadro {
    public static void main(String[] args) {
        int ancho = 8;
        int alto = 5;

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || i == alto - 1) {
                    System.out.print("-");
                } else if (j == 0 || j == ancho - 1) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
