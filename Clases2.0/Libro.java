package ico.fes;

public class Libro {
    private String titulo;
    private String editorial;
    private int paginas;
    private String autor;
    private boolean PastaDura;

    public Libro() {
    }

    public Libro(String titulo, String editorial, int paginas, String autor, boolean pastaDura) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.paginas = paginas;
        this.autor = autor;
        PastaDura = pastaDura;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPastaDura() {
        return PastaDura;
    }

    public void setPastaDura(boolean pastaDura) {
        PastaDura = pastaDura;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", paginas=" + paginas +
                ", autor='" + autor + '\'' +
                ", PastaDura=" + PastaDura +
                '}';
    }
    public boolean leer(){
        System.out.println("Esta leyendo");
        return true;
    }
    public boolean termino(){
        System.out.println("Ya lo termino de leer");
        return true;
    }
}
