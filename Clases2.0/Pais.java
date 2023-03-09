package ico.fes;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private String capital;
    private String continente;
    private String idioma;
    private String habitantes;

    public Pais() {
    }

    public Pais(String nombre, String capital, String continente, String idioma, String habitantes) {
        this.nombre = nombre;
        this.capital = capital;
        this.continente = continente;
        this.idioma = idioma;
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        ArrayList<String>       continentes = new ArrayList<>();
        continentes.add("asiatico");
        continentes.add("africano");
        continentes.add("americano");
        continentes.add("europeo");
        continentes.add("oceania");
        if (continentes.contains(continente.toLowerCase())){
        this.continente = continente;
        } else {
            System.out.println("No existe");
        }
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(String habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", capital='" + capital + '\'' +
                ", continente='" + continente + '\'' +
                ", idioma='" + idioma + '\'' +
                ", habitantes=" + habitantes +
                '}';
    }
    public boolean dia() {
        System.out.println("Ahora es de dia");
        return true;
    }
    public boolean apagar(){
        System.out.println("Ahora es de noche");
        return true;
    }
    public boolean onu(){
        System.out.println("Ahora es parte de la ONU");
        return true;
    }
}
