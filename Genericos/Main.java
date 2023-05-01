import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Caja<String > miCaja = new Caja<>(new String[10]);
        miCaja.add(0, "hola");
        miCaja.add(1, "adios");
        miCaja.add(2, "si");
        String temp = miCaja.get(2);
        System.out.println(miCaja);

        System.out.println("-----------");
        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.add(0, "talvez");
        cajaSin.add(1, "o no");
        cajaSin.add(2, "o nada");
        cajaSin.add(3, "va");
        System.out.println(cajaSin);
        String temp2 = (String) cajaSin.get(2);
        System.out.println("-----------------");

        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0, new Comida("Chetos", true));
        System.out.println(cajaComida.get(0));

        System.out.println("-------");

        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("Kiwi", false));
        comidas.add(new Comida("Kiwi", false));
        comidas.add(new Comida("Kiwi", false));
        comidas.add(new Comida("Kiwi", false));
        comidas.add(new Comida("Mantequilla", true));
        comidas.add(new Comida("Kiwi", false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(4));

        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Chetos", true));
        comidas2.add(new Comida("Zanahoria", false));
        comidas2.add(new Comida("Pera", false));
        comidas2.add(new Comida("Leche", true));
        comidas2.add(new Comida("Papa", false));
        System.out.println(comidas2.get(3));
        comidas2.set(3, new Comida("Huevo", false));
        comidas2.add(2, new Comida("NARANJA", false));
        System.out.println("----Final------");
        for (Comida comida: comidas2) {
            System.out.println(comida);
        }
    }
}