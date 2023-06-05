package org.example.vista;

import org.example.database.ComicDB;
import org.example.modelo.ModeloTablaComics;

import javax.swing.*;
import java.awt.*;

public class VentanaComic extends JFrame {
    private JLabel lblid;
    private JLabel lbltitulo;
    private JLabel lblURLPortada;
    private JLabel lblAutor;
    private JLabel lbleditorial;
    private JLabel lblanioLanzamiento;
    private JLabel lblnumPaginas;
    private JLabel lblInfoSel;
    private JTextField txtid;
    private JTextField txtTitulo;
    private JTextField txtURLPortada;
    private JTextField txtAutor;
    private JTextField txtEditorial;
    private JTextField txtAnioLanzamiento;
    private JTextField txtNumPaginas;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JTable tblComics;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel lblImagenComic;
    private JLabel lblEliminar;
    private  JTextField txtEliminar;
    private JButton btnEditar;
    private JButton btnEliminar;


    public VentanaComic(String title) throws HeadlessException {
        super(title);
        this.setSize(1200, 900);
        layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(layout);



        //Panel registro de datos
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(144, 241, 210, 255));
        lblid = new JLabel("ID:");
        lbltitulo = new JLabel("Titulo:");
        lblURLPortada = new JLabel("URL Portada:");
        lblAutor = new JLabel("Autor:");
        lbleditorial = new JLabel("Editorial:");
        lblanioLanzamiento = new JLabel("Anio Lanzamiento:");
        lblnumPaginas = new JLabel("Numero de Paginas:");
        txtid = new JTextField(3);
        txtid.setText("");
        txtid.setEnabled(false);
        txtTitulo = new JTextField(50);
        txtURLPortada = new JTextField(50);
        txtAutor = new JTextField(30);
        txtEditorial = new JTextField(20);
        txtAnioLanzamiento = new JTextField(5);
        txtNumPaginas = new JTextField(5);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblid);
        panel1.add(txtid);
        panel1.add(lbltitulo);
        panel1.add(txtTitulo);
        panel1.add(lblURLPortada);
        panel1.add(txtURLPortada);
        panel1.add(lblAutor);
        panel1.add(txtAutor);
        panel1.add(lbleditorial);
        panel1.add(txtEditorial);
        panel1.add(lblanioLanzamiento);
        panel1.add(txtAnioLanzamiento);
        panel1.add(lblnumPaginas);
        panel1.add(txtNumPaginas);
        panel1.add(btnAgregar);




        //Panel tabla
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(159, 147, 243, 255));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblComics = new JTable();
        scrollPane = new JScrollPane(tblComics);
        panel2.add(scrollPane);




        //Panel Imagen
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(0, 0, 0, 255));
        lblImagenComic = new JLabel("..");
        this.panel3.add(lblImagenComic);




        //Panel Modificaciones
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(241, 149, 205, 255));
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER));
        lblInfoSel = new JLabel("Usted selecciono el elemento No. 0");
        lblInfoSel.setFont(new Font("Arial", Font.BOLD, 15));
        btnEditar = new JButton("Editar");
        btnEliminar = new JButton("Eliminar");
        lblEliminar = new JLabel("Eliminar por ID:");
        txtEliminar = new JTextField(2);
        panel4.add(lblInfoSel);
        panel4.add(lblEliminar);
        panel4.add(txtEliminar);
        panel4.add(btnEliminar);
        panel4.add(btnEditar);

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblid() {
        return lblid;
    }

    public void setLblid(JLabel lblid) {
        this.lblid = lblid;
    }

    public JLabel getLbltitulo() {
        return lbltitulo;
    }

    public void setLbltitulo(JLabel lbltitulo) {
        this.lbltitulo = lbltitulo;
    }

    public JLabel getLblURLPortada() {
        return lblURLPortada;
    }

    public void setLblURLPortada(JLabel lblURLPortada) {
        this.lblURLPortada = lblURLPortada;
    }

    public JLabel getLblAutor() {
        return lblAutor;
    }

    public void setLblAutor(JLabel lblAutor) {
        this.lblAutor = lblAutor;
    }

    public JLabel getLbleditorial() {
        return lbleditorial;
    }

    public void setLbleditorial(JLabel lbleditorial) {
        this.lbleditorial = lbleditorial;
    }

    public JLabel getLblanioLanzamiento() {
        return lblanioLanzamiento;
    }

    public void setLblanioLanzamiento(JLabel lblanioLanzamiento) {
        this.lblanioLanzamiento = lblanioLanzamiento;
    }

    public JLabel getLblnumPaginas() {
        return lblnumPaginas;
    }

    public void setLblnumPaginas(JLabel lblnumPaginas) {
        this.lblnumPaginas = lblnumPaginas;
    }

    public JTextField getTxtid() {
        return txtid;
    }

    public void setTxtid(JTextField txtid) {
        this.txtid = txtid;
    }

    public JTextField getTxtTitulo() {
        return txtTitulo;
    }

    public void setTxtTitulo(JTextField txtTitulo) {
        this.txtTitulo = txtTitulo;
    }

    public JTextField getTxtURLPortada() {
        return txtURLPortada;
    }

    public void setTxtURLPortada(JTextField txtURLPortada) {
        this.txtURLPortada = txtURLPortada;
    }

    public JTextField getTxtAutor() {
        return txtAutor;
    }

    public void setTxtAutor(JTextField txtAutor) {
        this.txtAutor = txtAutor;
    }

    public JTextField getTxtEditorial() {
        return txtEditorial;
    }

    public void setTxtEditorial(JTextField txtEditorial) {
        this.txtEditorial = txtEditorial;
    }

    public JTextField getTxtAnioLanzamiento() {
        return txtAnioLanzamiento;
    }

    public void setTxtAnioLanzamiento(JTextField txtAnioLanzamiento) {
        this.txtAnioLanzamiento = txtAnioLanzamiento;
    }

    public JTextField getTxtNumPaginas() {
        return txtNumPaginas;
    }

    public void setTxtNumPaginas(JTextField txtNumPaginas) {
        this.txtNumPaginas = txtNumPaginas;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JTable getTblComics() {
        return tblComics;
    }

    public void setTblComics(JTable tblComics) {
        this.tblComics = tblComics;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel1;
    }

    public void setPanel4(JPanel panel4) {
        this.panel1 = panel4;
    }

    public JLabel getLblImagenComic() {
        return lblImagenComic;
    }

    public void setLblImagenComic(JLabel lblImagenComic) {
        this.lblImagenComic = lblImagenComic;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JLabel getLblEliminar() {
        return lblEliminar;
    }

    public void setLblEliminar(JLabel lblEliminar) {
        this.lblEliminar = lblEliminar;
    }

    public JTextField getTxtEliminar() {
        return txtEliminar;
    }

    public void setTxtEliminar(JTextField txtEliminar) {
        this.txtEliminar = txtEliminar;
    }



    public JLabel getLblInfoSel() {
        return lblInfoSel;
    }

    public void setLblInfoSel(JLabel lblInfoSel) {
        this.lblInfoSel = lblInfoSel;
    }

    public void limpiar(){
        txtTitulo.setText("");
        txtURLPortada.setText("");
        txtAutor.setText("");
        txtEditorial.setText("");
        txtAnioLanzamiento.setText("");
        txtNumPaginas.setText("");
    }
}
