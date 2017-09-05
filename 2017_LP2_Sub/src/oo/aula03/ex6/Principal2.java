package oo.aula03.ex6;

import java.util.Scanner;

public class Principal2 {
    
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        Radio radio = new Radio();
        
        System.out.println("Aumentar volume em quanto?");
        int qt = leitura.nextInt();
        radio.aumentarVolume(qt);
        
        radio.mostrarVolume();
        
        System.out.println("Quer desligar o rádio (S/N)?");
        String texto = leitura.next();
        if (texto.equalsIgnoreCase("S")) {
            radio.desligar();
        }
        
        radio.mostrarVolume();
    }
    
}
