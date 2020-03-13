package com.company;
import com.sun.scenario.effect.Offset;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.*;

public class Main {

    public static void TestCaesarCipherDecipher(){

        String Text ="abcwvxyz" ;
        int offset = 3;
        CaesarCipher Cezar = new CaesarCipher();

        System.out.println(Cezar.encrypt(Text, offset));
        String CezardDecoded = Cezar.encrypt(Text,3).toString();
        System.out.println(Cezar.decrypt(CezardDecoded,3));
    }

    public static void TestVigenereCipherDecipher(){

        String Text ="Ana are mere" ;
        String Key ="Flori" ;
        Key = Key.toUpperCase();
        Text = Text.replaceAll("\\s+","");
        Vigenere Vig = new Vigenere();

        System.out.println(Vig.encrypt(Text,Key));
        String Decode = Vig.encrypt(Text,Key);
        System.out.println(Vig.decrypt(Decode,Key));

    }

    public static void main(String[] args) throws IOException {

        String Text = JOptionPane.showInputDialog(null,"Enter The Text");
        File file = new File("C:\\Users\\Frosch\\Documents\\GitHub\\Crypto-Caesar-Vigenere-\\Cripto Tema 1\\src\\com\\company\\input.txt");
        FileWriter myWriter = new FileWriter("C:\\Users\\Frosch\\Documents\\GitHub\\Crypto-Caesar-Vigenere-\\Cripto Tema 1\\src\\com\\company\\output.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String Key = br.readLine();
        Key = Key.toUpperCase();
        int offset =  Integer.parseInt(br.readLine());
        Text = Text.replaceAll("\\s+","");

	    CaesarCipher Cezar = new CaesarCipher();
	    Vigenere Vig = new Vigenere();

	    //Codificare Utilizand Cifru Cezar
	    String Text2 = Cezar.encrypt(Text,offset).toString();

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


        myWriter.write(Vig.encrypt(Text2,Key));
        myWriter.close();
        //TestCaesarCipherDecipher();
        //TestVigenereCipherDecipher();


    }
}
