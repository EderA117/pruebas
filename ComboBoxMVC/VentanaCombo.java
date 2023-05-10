package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class VentanaCombo extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private GridLayout layout;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnAgregar;
    private JComboBox<String> combo;
    private ModeloComboNombre modelo;
    private ArrayList<String> inicial;

    public VentanaCombo(String title) throws HeadlessException {
        super(title);
        inicial = new ArrayList<>();
        inicial.add("Diana");
        inicial.add("Susana");
        inicial.add("Diego");
        this.setSize(400,600);
        layout = new GridLayout(2,1);
        this.getContentPane().setLayout(layout);
        panel1 = new JPanel();
        panel1.setBackground(new Color(144, 241, 210));
        this.getContentPane().add(panel1);
        lblNombre = new JLabel("Introduce tu nombre ");
        panel1.add(lblNombre);
        txtNombre = new JTextField(20);
        panel1.add(txtNombre);
        btnAgregar = new JButton("Add");
        panel1.add(btnAgregar);

        btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                System.out.println("Evento clic");
                modelo.agregarNombre(txtNombre.getText());
                combo.setModel(modelo);
                // forzar a repintar la vista
                txtNombre.setText("");
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                System.out.println("Entró al botón");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Saliendo..");
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Dragging.....");
            }
        });

        panel2 = new JPanel();
        panel2.setBackground(new Color(250, 155, 192));
        //String[] nombres ={"Jose", "Eder", "Diana", "Susana"};

        modelo = new ModeloComboNombre(inicial);
        combo = new JComboBox<>(modelo);
        panel2.add(combo);
        this.getContentPane().add(panel2);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}