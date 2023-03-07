public class MainTarea {
    public static void main(String[] args) {
        Monitor moni3 = new Monitor(24, "lg", "UltraWide", "LED", 12000.00);
        moni3.setPulgadas(40);
        System.out.println(moni3);
        moni3.setMarca("la del gobierno");
        System.out.println(moni3);

        Persona per = new Persona(19,"Eder",1.72,63.00,"M");
        System.out.println(per);
        per.setEdad(30);
        System.out.println(per);

        Desodorante des1 = new Desodorante("Gillete","COOL",47.56,150,true);
        System.out.println(des1);
        des1.setMarca("piedra de lumbre");
        des1.setAroma("ChocoLayte intenso");
        des1.setPrecio(60);
        des1.setMarca("Gillete");
        System.out.println(des1);
    }
}
