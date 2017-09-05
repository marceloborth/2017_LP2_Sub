package oo.aula01;


public class PrincipalCachorro {
    
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro(); //Declaração e instanciação
        
        //Atribuição dos dados do cachorro
        c1.nome = "Thor";
        c1.cor = "Marrom";
        c1.idade = 2;
        c1.raca = "Pastor alemão";
        c1.tamanho = 60;
        
        //Saída de dados
        System.out.println("Nome: " + c1.nome);
        System.out.println("Cor: " + c1.cor);
        //...
        
        c1.latir();
        c1.sentar();
        
    }
}
