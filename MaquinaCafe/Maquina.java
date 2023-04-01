import java.util.Scanner;

public class Maquina {
    private int agua;
    private int cafe;
    private int crema;
    private Vasos vasos;
    private int Americano;
    private int Expreso;
    private int Capuchino;

    public Maquina() {
        this.setAgua(5000);
        this.setCafe(1000);
        this.setCrema(1500);
        this.vasos = new Vasos(50,2000);
    }

    public Maquina(int agua, int cafe, int crema, Vasos vasos, int americano, int expreso, int capuchino) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
        this.vasos.setCantidad(20);
        Americano = americano;
        Expreso = expreso;
        Capuchino = capuchino;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        if (agua<100) System.out.println("No mas cafe");
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {

        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {

        this.crema = crema;
    }

    public Vasos getVasos() {
        return vasos;
    }

    public void setVasos(Vasos vasos) {
        this.vasos = vasos;
    }

    public int getAmericano() {
        return Americano;
    }

    public void setAmericano(int americano) {
        if(this.agua>=180 && this.cafe>=15 && this.vasos.getCantidad() >= 1) {
            Americano = americano;
        } else System.out.println("Ya no alcanza");
    }

    public int getExpreso() {
        return Expreso;
    }

    public void setExpreso(int expreso) {
        if(this.agua>=120 && this.cafe>=20 && this.vasos.getCantidad() >= 1) {
            Expreso = expreso;
        } else System.out.println("Ya no alcanza");
    }

    public int getCapuchino() {
        return Capuchino;
    }

    public void setCapuchino(int capuchino) {
        if(this.agua>=100 && this.cafe>=14 && this.vasos.getCantidad() >= 1 && this.crema>=70) {
            Capuchino = capuchino;
        } else System.out.println("Ya no alcanza");
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                ", Americano=" + Americano +
                ", Expreso=" + Expreso +
                ", Capuchino=" + Capuchino +
                '}';
    }
    public void servir(int i){
        if (i == 1){
            this.agua= this.agua-180;
            this.cafe= this.cafe-15;
        } else if(i == 2) {
            this.agua= this.agua-120;
            this.cafe= this.cafe-20;
        } else if(i == 3){
            this.agua= this.agua-100;
            this.cafe= this.cafe-14;
            this.crema= this.crema-70;
        } else System.out.println("No existe ese");
    }
    public void mostar(){
        if (agua<100){
            System.out.println("No mas cafe");
        } else {
            System.out.println("Agua: " + this.agua);
            System.out.println("Cafe: " + this.cafe);
            System.out.println("Crema: " + this.crema);
        }
    }
}
