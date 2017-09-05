package oo.aula02;

public class Caneta {
    
    //Atributos (O que eu tenho?)
    String modelo;
    int carga;
    boolean tampada;
    String cor;
    boolean refil;
    double ponta;
    
    //Métodos (O que eu faço?)
    void escrever() {
        System.out.println("Escrevendo...");
    }
    void desenhar() {
        System.out.println("Desenhando...");
    }
    void destampar() {
        System.out.println("Destampando...");
    }
    void tampar() {
        System.out.println("Tampando...");
    }
    void mostrarStatus() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Carga: " + carga + "%");
        System.out.println("Cor da caneta " + cor);
        System.out.println("A caneta está tampada? " + tampada);
    }
}
