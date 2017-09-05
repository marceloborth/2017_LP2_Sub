package oo.aula03.ex3;

/**
 *
 * Crie uma classe para representar um aluno matriculado em uma disciplina. 
 * Esse aluno deve ter informações de: matrícula, nome do aluno, 2 notas de 
 * prova e 2 notas de trabalho. A classe aluno deve ter um método chamado 
 * "mostrarMédia" que calculará e mostrará a média aritmética das notas do 
 * aluno e um método chamado "mostrarConceito" que mostrará o conceito do aluno. 
 */
public class Aluno {
    
    int matricula;
    String nome;
    Double prova;
    Double trabalho;
    Double media;
    boolean ativo = true;
    
    void mostrarMedia() {
        calcularMedia();
        System.out.println("Média: " + media);
    }
    
    void calcularMedia() {
        media = (prova + trabalho) / 2;
    }
    
    String verificarStatus() {
        //if (ativo == true) {
        if (ativo) {
            return "Verdadeiro";
        } else {
            return "Falso";
        }
    }
    
    void mostrarConceito() {
        calcularMedia();
        System.out.print("Conceito ");
        
        if (media >= 90) {
            System.out.println("A");
        } else if (media >= 70) {
            System.out.println("B");
        } else if (media >= 50) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
    
    void mostrarStatus() {
        System.out.println(matricula + " - " + nome);
        System.out.println("Ativo: " + verificarStatus());
        System.out.println("Prova: " + prova);
        System.out.println("Trabalho: " + trabalho);
    }

}
