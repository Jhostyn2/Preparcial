package umg.principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JPanel frmMENU;
    private JButton cmd_ejer1;
    private JButton cmd_ejer2;
    private JButton cmd_ejer3;
    private JButton cmd_salir;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario1");
        frame.setContentPane(new Menu().frmMENU);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public Menu() {


        cmd_ejer1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ejer_1 abrir = new Ejer_1();
                abrir.setVisible(true);
                dispose();
            }
        });


        cmd_ejer2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ejer_2 abrir2 = new Ejer_2();
                abrir2.setVisible(true);
                dispose();
            }
        });


        cmd_ejer3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ejer_3 abrir3 = new Ejer_3();
                abrir3.setVisible(true); // Abre el formulario 3
                dispose(); // Cierra la ventana actual (MENUPRINCIPAL)
            }
        });


        cmd_salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Cierra el programa
            }
        });
    }
}


