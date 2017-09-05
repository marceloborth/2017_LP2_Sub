package oo.aula05;

public class PessoaTeste {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Joao Antunes");
        p1.setCpf("05248163951");
        System.out.println(p1.getNome() + " tem o cpf " + p1.getCpf());
        
        System.out.println("--------");
        
        Pessoa p2 = new Pessoa();
        p2.setNome("C");
        p2.setCpf("12345678955");
        System.out.println(p2.getNome() + " tem o cpf " + p2.getCpf());
    }
    
}
