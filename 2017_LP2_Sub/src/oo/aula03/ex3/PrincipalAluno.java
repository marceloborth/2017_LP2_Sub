package oo.aula03.ex3;

public class PrincipalAluno {
    
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.matricula = 1546;
        a.nome = "Pedro";
        a.prova = 80.0;
        a.trabalho = 0.0;
        
        a.mostrarStatus();
        a.mostrarMedia(); //40.0
        a.mostrarConceito(); //D
        
        a.trabalho = 80.0;
        a.mostrarConceito(); //B
        
    }
    
}
