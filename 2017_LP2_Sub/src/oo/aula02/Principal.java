package oo.aula02;

public class Principal {

    public static void main(String[] args) {
        //Instanciação (Criação de um objeto 'caneta1')
        Caneta caneta1 = new Caneta();
        //Atribuição de valores
        caneta1.modelo = "BIC";
        caneta1.carga = 80;
        caneta1.tampada = true;
        caneta1.cor = "Azul";
        caneta1.refil = false;
        caneta1.ponta = 0.7;
        
        caneta1.mostrarStatus();
        caneta1.tampada = true; //Alteração
        caneta1.mostrarStatus();

        caneta1.escrever();
        caneta1.desenhar();
        caneta1.destampar();
        caneta1.tampar();
    }
    
}
