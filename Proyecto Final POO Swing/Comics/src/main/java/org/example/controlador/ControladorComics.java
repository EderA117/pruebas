package org.example.controlador;

import org.example.modelo.Comics;
import org.example.modelo.ModeloTablaComics;
import org.example.vista.VentanaComic;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.sql.SQLException;

public class ControladorComics extends MouseAdapter {
    private VentanaComic view;
    private ModeloTablaComics model;

    public ControladorComics(VentanaComic view) {
        this.view = view;
        model = new ModeloTablaComics();
        this.view.getTblComics().setModel(model);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getTblComics().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getBtnEditar().addMouseListener(this);


    }

    @Override
    public void mouseClicked(MouseEvent e) {

        //Cargar datos de Base de datos a Tabla
        if (e.getSource() == this.view.getBtnCargar()){
            model.cargarDatos();
            this.view.getTblComics().setModel(model);
            this.view.getTblComics().updateUI();

        }

        //Agregar a Tabla y Base de datos
        if (e.getSource() == this.view.getBtnAgregar()){
            ImageIcon icon1 = new ImageIcon("icon1.png");
            ImageIcon icon2 = new ImageIcon("icon2.png");
            Comics comic = new Comics();
            try {
                comic.setId(0);
                comic.setTitulo(this.view.getTxtTitulo().getText());
                comic.setURLPortada(this.view.getTxtURLPortada().getText());
                comic.setAutor(this.view.getTxtAutor().getText());
                comic.setEditorial(this.view.getTxtEditorial().getText());
                comic.setAnioLanzamiento(Integer.parseInt(this.view.getTxtAnioLanzamiento().getText()));
                comic.setNumPaginas(Integer.parseInt(this.view.getTxtNumPaginas().getText()));
                if (model.agregarComic(comic)) {
                    JOptionPane.showMessageDialog(view, "Se agrego correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE, icon1);
                    model.cargarDatos();
                    this.view.getTblComics().setModel(model);
                    this.view.getTblComics().updateUI();

                } else {
                    JOptionPane.showMessageDialog(view, "No se pudo Agregar a la base de datos, porfavor revise su conexion", "Eroro al insertar", JOptionPane.ERROR_MESSAGE, icon2);
                }
                this.view.limpiar();
            }catch (NumberFormatException eN){
                JOptionPane.showMessageDialog(view, "Ingreso datos diferentes a los numericos en Anio y/o NumPaginas, revise porfavor", "Error datos invalidos", JOptionPane.ERROR_MESSAGE, icon2);
            }
        }

        //Mostar imagen
        if (e.getSource() == this.view.getTblComics()){
            System.out.println("Click sobre la tabla");
            int rowIndex = view.getTblComics().getSelectedRow();
            Comics temp = model.obtenerComics(rowIndex);
            view.getLblImagenComic().setText("");
            view.getLblImagenComic().setIcon(temp.createIcon());
        }


        //Eliminar por id
        if (e.getSource() == this.view.getBtnEliminar()){
            ImageIcon icon1 = new ImageIcon("icon1.png");
           System.out.println("Click sobre el boton");
           ImageIcon icon = new ImageIcon("prueba1.png");
           ImageIcon icon2 = new ImageIcon("icon3.png");
           JOptionPane.showMessageDialog(view, "Esta apunto de eliminar de la base de datos, asegurese de cargar la tabala y visualizar el Id a eliminar", "Delete", JOptionPane.WARNING_MESSAGE, icon);
           int respuesta = JOptionPane.showConfirmDialog(view, "Esta seguro de eliminar?", "Delete Database", JOptionPane.YES_NO_OPTION, 1, icon2);
           if (respuesta == JOptionPane.YES_NO_OPTION ){
               String id = view.getTxtEliminar().getText();
                if (model.eliminarDatos(id)){
                    JOptionPane.showMessageDialog(view, "Se elimino correctamente", "Exitoso", JOptionPane.WARNING_MESSAGE, icon1);
                }
                model.cargarDatos();
                this.view.getTblComics().updateUI();
                this.view.limpiar();
            }
       }

        //Seleccionar Elemento de tabla y rellenar
        if (e.getSource() == this.view.getTblComics()) {
            int index = this.view.getTblComics().getSelectedRow();
            Comics tmp = model.getComicAddIndex(index);

            this.view.getTxtTitulo().setText(tmp.getTitulo());
            this.view.getTxtURLPortada().setText(tmp.getURLPortada());
            this.view.getTxtAutor().setText(tmp.getAutor());
            this.view.getTxtEditorial().setText(tmp.getEditorial());
            this.view.getTxtAnioLanzamiento().setText(String.valueOf(tmp.getAnioLanzamiento()));
            this.view.getTxtNumPaginas().setText(String.valueOf(tmp.getNumPaginas()));

            this.view.getLblInfoSel().setText("Usted selecciono el elemento No." + tmp.getId());

            this.view.getLblImagenComic().setIcon(tmp.createIcon());
        }


        //Modificar
        if (e.getSource() == this.view.getBtnEditar()) {
            int index = this.view.getTblComics().getSelectedRow();
            Comics tmp = model.getComicAddIndex(index);
            Comics comic = new Comics();
            try {
                comic.setTitulo(this.view.getTxtTitulo().getText());
                comic.setURLPortada(this.view.getTxtURLPortada().getText());
                comic.setAutor(this.view.getTxtAutor().getText());
                comic.setEditorial(this.view.getTxtEditorial().getText());
                comic.setAnioLanzamiento(Integer.parseInt(this.view.getTxtAnioLanzamiento().getText()));
                comic.setNumPaginas(Integer.parseInt(this.view.getTxtNumPaginas().getText()));
                comic.setId(tmp.getId());

                if (model.modificarComic(comic)) {
                    ImageIcon icon1 = new ImageIcon("icon1.png");
                    JOptionPane.showMessageDialog(view, "Se modifico correctamente", "Aviso"
                            , JOptionPane.INFORMATION_MESSAGE, icon1);
                    model.cargarDatos();
                    this.view.getTblComics().setModel(model);
                    this.view.getTblComics().updateUI();
                } else {
                    ImageIcon icon2 = new ImageIcon("icon2.png");
                    JOptionPane.showMessageDialog(view, "No se pudo modificar a la base de datos," +
                            " por favor revise su conexión ", "Error al modificar", JOptionPane.ERROR_MESSAGE, icon2);
                }
                this.view.getTblComics().updateUI();
                this.view.limpiar();
            }catch (SQLException sqle){
                System.out.println(sqle.getMessage());
            }
        }


    }

}
