package oo.aula01;

public class PrincipalPessoa {
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        
        p.nome = "João";
        p.cpf = "000.111.222-44";
        p.rg = "123456-9";
        p.idade = 41;
        p.estadoCivil = "Casado";
        p.endereco = "Rua A";
        
        System.out.println("Nome: " + p.nome);
        System.out.println("CPF: " + p.cpf);
        System.out.println("RG: " + p.rg);
        //...
        
    }
    
}
