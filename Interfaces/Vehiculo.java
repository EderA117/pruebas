public interface Vehiculo {
    public static  final int VelocidadMaxima=120;
    public static final char ClasificacionEficiencia= 'A';

    public boolean encender();
    public boolean apagar();
    public void avanzar();
    public void frenar();
}
