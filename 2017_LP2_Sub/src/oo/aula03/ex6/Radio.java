package oo.aula03.ex6;

public class Radio {
    int volume = 0;
    boolean ligado = false;
    
    void ligar() {
        ligado = true;
        volume = 0;
    }
    void desligar() {
        ligado = false;
        volume = 0;
    }
    void aumentarVolume(int qt) {
        volume = volume + qt;
    }
    void diminuirVolume(int qt) {
        volume = volume - qt;
    }
    void mostrarVolume() {
        System.out.println("Volume " + volume);
    }
    
}
