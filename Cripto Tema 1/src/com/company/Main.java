package com.company;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String Text = JOptionPane.showInputDialog(null,"Enter The Text");
        String Key = JOptionPane.showInputDialog(null,"Enter The Key");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Caesar Offset"));

	    CaesarCipher Cezar = new CaesarCipher();
	    Vigenere Vig = new Vigenere();
	    //String Text = "Every cloud has a silver lining";
	   // String Key = "CRIPTOGRAFIE";

	    //Codificare Utilizand Cifru Cezar
	    String Text2 = Cezar.encrypt(Text,age).toString();

	    //Codificare Utilizand Cifrul Vigenere
	    Vig.encrypt(Text2,Key);



    }
}
