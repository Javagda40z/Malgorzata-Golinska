package wyjatki;

import java.io.IOException;

public class Testowa {
    public static void main(String[] args) {
        try {
            throw new IOException();

        } catch (IOException e) {

        }
    }
    
}
