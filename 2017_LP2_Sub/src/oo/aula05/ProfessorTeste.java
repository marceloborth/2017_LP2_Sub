package oo.aula05;

public class ProfessorTeste {
    
    public static void main(String[] args) {
        Professor p1 = new Professor();
        p1.setArea("Computação");
        p1.setFormacao("Técnico em Informática");
        p1.setStatus(true);
        
        
        Professor p2 = new Professor();
        p2.setFormacao("Computação");
        
        p1 = null;
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
}
