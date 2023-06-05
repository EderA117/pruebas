package org.example.modelo;

import org.example.database.ComicDB;
import org.example.vista.VentanaComic;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaComics implements TableModel {

    public static final int COLUMS = 7;
    private ArrayList<Comics> datos;
    private ComicDB DB;
    private VentanaComic ventana;

    public ModeloTablaComics() {
        DB = new ComicDB();
        datos = new ArrayList<>();
    }

    public ModeloTablaComics(ArrayList<Comics> datos) {
        this.datos = datos;
        DB = new ComicDB();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Id";
            case 1:
                return "Titulo";
            case 2:
                return "URLPortada";
            case 3:
                return "Autor";
            case 4:
                return "Editorial";
            case 5:
                return "Aniolanzamiento";
            case 6:
                return "NumPaginas";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return Integer.class;
            case 6:
                return Integer.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Comics tmp = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getTitulo();
            case 2:
                return tmp.getURLPortada();
            case 3:
                return tmp.getAutor();
            case 4:
                return tmp.getEditorial();
            case 5:
                return tmp.getAnioLanzamiento();
            case 6:
                return tmp.getNumPaginas();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                break;
            case 1:
                datos.get(rowIndex).setTitulo((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setURLPortada((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setAutor((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setEditorial((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setAnioLanzamiento((Integer) aValue);
                break;
            case 6:
                datos.get(rowIndex).setNumPaginas((Integer) aValue);
                break;
            default:
                System.out.println("No se modifica nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void cargarDatos() {
        try {
            datos = DB.obtenerTodo();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public boolean eliminarDatos(String id) {
        boolean resultado = false;
        try {
            if (DB.delete(id)) {
                DB.delete(id);
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }
        return resultado;
    }

    public boolean agregarComic(Comics comic) {
        boolean resultado = false;
        try {
            if (DB.insertar(comic)) {
                datos.add(comic);
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    public Comics obtenerComics(int rowIndex) throws IndexOutOfBoundsException {
        return datos.get(rowIndex);
    }

    public boolean modificarComic(Comics comic) throws SQLException{
        boolean resultado = false;
        try {
            if (DB.update(comic)){
                datos.add(comic);
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public Comics getComicAddIndex(int index){
        return datos.get(index);
    }
}

