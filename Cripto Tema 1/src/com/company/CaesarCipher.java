package com.company;

public class CaesarCipher {

    public CaesarCipher(){
    }

    public String encrypt(String message, int key)
    {

        String result= "";
        for(int i = 0; i < message.length(); ++i){
            char ch = message.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + key);

                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }

                result += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + key);

                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }

                result += ch;
            }
            else {
                result += ch;
            }
        }

        return result;

    }

    public String decrypt(String message, int key)
    {
        String result= "";
        for(int i = 0; i < message.length(); ++i) {
            char ch = message.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - key);

                if (ch < 'a') {
                    ch = (char) (ch + 'z' - 'a' + 1);
                }

                result += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - key);

                if (ch < 'A') {
                    ch = (char) (ch + 'Z' - 'A' + 1);
                }

                result += ch;
            } else {
                result += ch;
            }
        }
        return result;
    }
}