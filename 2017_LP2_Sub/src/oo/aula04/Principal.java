package oo.aula04;

public class Principal {
    
    public static void main(String[] args) {
        Conta c = new Conta();
        
        //c.titular = "João";
        c.setTitular("João");
        c.setConta(12345);
        c.setSaldo(1250.00);
        c.setAtivo(true);
        
        String nome = c.getTitular();
        int conta = c.getConta();
        Double saldo = c.getSaldo();
        boolean ativo = c.isAtivo();
        
        System.out.println(nome + " - " + conta + " - " + saldo + " - " + ativo);
        
    }
    
}