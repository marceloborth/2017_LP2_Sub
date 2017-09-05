package oo.aula03.ex4;

public class Principal {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa(); //Criamos um novo objeto "pessoa1"
        pessoa1.nome = "João"; //Setamos o nome para "pessoa1"
        pessoa1.idade = 24; //Setamos a idade para "pessoa1"
        
        pessoa1.mostrarIdade(); //24
        pessoa1.fazAniversario(); //adicionar 1 na idade
        pessoa1.mostrarIdade(); //25
        
        for (int i = 0; i < 5; i++) { //5x
            pessoa1.fazAniversario();
        }
        pessoa1.mostrarIdade(); //30
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Ana";
        pessoa2.idade = 35;
        pessoa2.fazAniversario();
        pessoa2.fazAniversario();
        pessoa2.mostrarIdade();
    }
}
