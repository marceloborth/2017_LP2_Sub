package oo.aula06;

public class Principal {
  
  public static void main(String[] args) {
    
    Curso c1 = new Curso();
    
    String nome = "Tec. em Informática";
    Curso c2 = new Curso(nome);
    
    Curso c3 = new Curso("Info", "TI");
    System.out.println("Nome: " + c3.getNome());
    System.out.println("Área: " + c3.getArea());
    

    
    Curso c4 = new Curso();
    c4.setNome("Tec. em Informática");
    c4.setArea("TI");
    
  }
  
}
