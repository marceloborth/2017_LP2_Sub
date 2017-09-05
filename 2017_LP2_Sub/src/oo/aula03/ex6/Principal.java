package oo.aula03.ex6;

public class Principal {
    
    public static void main(String[] args) {
        
        Radio radio1 = new Radio();
        radio1.ligar();
        radio1.mostrarVolume();
        radio1.aumentarVolume(15);
        radio1.mostrarVolume();
        radio1.desligar();
        radio1.mostrarVolume();
        
        Radio radio2 = new Radio();
        radio2.ligar();
        radio2.aumentarVolume(1);
        radio2.aumentarVolume(1);
        radio2.aumentarVolume(1);
        radio2.mostrarVolume();
    }
    
}
