package oo.aula03.ex4;


/**
 * 4) Crie uma classe chamada "Pessoa" com os atributos nome e idade, 
 * e os métodos "void fazAniversario()" e "void mostrarIdade()". Cada 
 * vez que o método fazAniversario() for chamado deve-se aumentar um 
 * ano de vida da pessoa. Depois de definir a classe "Pessoa" (com 
 * atributos e métodos), crie uma classe principal para instanciar 
 * Pessoa e fazer as atribuições dos atributos. Chame algumas vezes 
 * o método fazAniversario() e mostre a idade da pessoa a partir da 
 * chamada do método mostrarIdade().
 */
public class Pessoa {
    
    String nome;
    int idade;
    
    void fazAniversario() {
        idade++; //Adiciona 1 na idade
    }
    
    void mostrarIdade() {
        System.out.println(nome + " tem " + idade + " anos.");
    }
}
