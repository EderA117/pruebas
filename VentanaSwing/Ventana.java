package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JButton btnPanel1;
    private JLabel etiquetaPanel1;
    private JPanel panel2;
    private JLabel etiquetaPanel2;

    private JPanel panel3;
    private JComboBox<String> comboPanel3;
    private JPanel panel4;
    private GridLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel();
        panel1.setBackground(new Color(120, 222, 226, 245));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        btnPanel1 = new JButton("Presioname");
        panel1.add(btnPanel1);
        etiquetaPanel1 = new JLabel(".....");
        panel1.add(etiquetaPanel1);
        btnPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiquetaPanel1.setText("Hola presionaste el boton del panel 1");
            }
        });
        this.getContentPane().add(panel1, 0);


        //panel2
        String urlimagen = "https://cdn.discordapp.com/icons/613950310393708574/9004db66b58edcee542bed6fc96ceb6e.png";

        panel2 = new JPanel();
        panel2.setBackground(new Color(231, 113, 187));
        panel2.setLayout(new FlowLayout());
        //Cargar imagen de internet

        try{
            URL url = new URL(urlimagen);
            Image imagen = ImageIO.read(url);
            ImageIcon imagenIcon = new ImageIcon(imagen);
            etiquetaPanel2 = new JLabel(imagenIcon);
            panel2.add(etiquetaPanel2);
            this.getContentPane().add(panel2, 1);

        }catch(MalformedURLException e){
            System.out.println("No valida");
        }catch(Exception me){
            System.out.println("Error al cargar la imagen");
        }




        //panel3
        panel3 = new JPanel();
        panel3.setBackground(new Color(240, 248, 128));

        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[] elementos = {"Opcion 1", "Opcion 2", "Opcion 3", "Opcion 4"};
        comboPanel3 = new JComboBox<>(elementos);
        comboPanel3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString() );
                System.out.println(comboPanel3.getSelectedIndex());
            }
        });
        panel3.add(comboPanel3);
        this.getContentPane().add(panel3, 2);


        //panel4
        panel4 = new JPanel();
        panel4.setBackground(new Color(184, 128, 248));
        this.getContentPane().add(panel4, 3);


        this.setVisible(true);
    }
}
