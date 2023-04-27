public class DriverVehiculo {
    public static void main(String[] args) {
        Camion CAMION = new Camion("Diesel", 3);
        System.out.println(CAMION);
        System.out.println(CAMION.encender());
        CAMION.avanzar();
        CAMION.frenar();
        System.out.println(CAMION.apagar());
        System.out.println("-----------Moto---------");
        Motocicleta moto = new Motocicleta(150, "Duki");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacercaballito();
        moto.frenar();
        moto.apagar();
    }
}
