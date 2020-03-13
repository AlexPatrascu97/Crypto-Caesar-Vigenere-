package com.company;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        String Text = JOptionPane.showInputDialog(null,"Enter The Text");
        String Key = JOptionPane.showInputDialog(null,"Enter The Key");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Caesar Offset"));

	    CaesarCipher Cezar = new CaesarCipher();
	    Vigenere Vig = new Vigenere();

	    //Codificare Utilizand Cifru Cezar
	    String Text2 = Cezar.encrypt(Text,age).toString();

        //Setare  GUI
        JFrame f = new JFrame();
        f.setPreferredSize(new Dimension(1200, 300));
        f.pack();
        f.setLocationRelativeTo(null);
        JPanel p = new JPanel();

        //Codificare Utilizand Cifrul Vigenere
        JLabel l = new JLabel(Vig.encrypt(Text2,Key));

        p.add(l);
        f.add(p);
        f.setVisible(true);


    }
}
