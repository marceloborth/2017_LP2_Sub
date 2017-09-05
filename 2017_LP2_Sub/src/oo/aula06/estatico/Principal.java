package oo.aula06.estatico;

public class Principal {
  
  public static void main(String[] args) {
    
    Pessoa p1 = new Pessoa("Romildo");
    System.out.println("Total de pessoas: " + Pessoa.contador);
    
    Pessoa p2 = new Pessoa("Ana");
    System.out.println("Total de pessoas: " + Pessoa.contador);
    
    Pessoa p3 = new Pessoa();
    System.out.println("Total de pessoas: " + Pessoa.contador);
    
    Pessoa p4 = new Pessoa();
    System.out.println("Total de pessoas: " + Pessoa.contador);
  }
  
}
