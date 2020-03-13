package com.company;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Vigenere {

    public Vigenere() {
    }

    public
    String encrypt(String Message, String Key) {

        String EMessage = "";
        Message = Message.toUpperCase();
        for (int i = 0, j = 0; i < Message.length(); i++) {
            char letter = Message.charAt(i);
            EMessage += (char)(((letter - 65) + (Key.charAt(j)-65)) % 26 + 65);
            j = ++j % Key.length();
        }
        return EMessage;
    }

}
