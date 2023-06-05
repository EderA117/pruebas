package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Comics {
    private int id;
    private String titulo;
    private String URLPortada;
    private String Autor;
    private String editorial;
    private int anioLanzamiento;
    private int numPaginas;

    public Comics() {
    }

    public Comics(int id, String titulo, String URLPortada, String autor, String editorial, int anioLanzamiento, int numPaginas) {
        this.id = id;
        this.titulo = titulo;
        this.URLPortada = URLPortada;
        Autor = autor;
        this.editorial = editorial;
        this.anioLanzamiento = anioLanzamiento;
        this.numPaginas = numPaginas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getURLPortada() {
        return URLPortada;
    }

    public void setURLPortada(String URLPortada) {
        this.URLPortada = URLPortada;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", URLPortada='" + URLPortada + '\'' +
                ", Autor='" + Autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", anioLanzamiento=" + anioLanzamiento +
                ", numPaginas=" + numPaginas +
                '}';
    }

    public ImageIcon createIcon(){
        ImageIcon resultado = null;
        try {
            URL urlImagen = new URL(this.URLPortada);
            resultado = new ImageIcon(urlImagen);
        }catch (MalformedURLException mue){
            System.out.println(mue.toString());
        }
        return resultado;
    }
}
