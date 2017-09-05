package oo.aula01;

public class Principal {
    
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();
        
        cb.nome = "Marcos";
        cb.agencia = "1234";
        cb.conta = "556-4";
        cb.saldo = -510.22;
        
        System.out.println("Nome: " + cb.nome);
        System.out.println("Agência: " + cb.agencia);
        System.out.println("Conta: " + cb.conta);
        System.out.println("Saldo: " + cb.saldo);
        
        System.out.println("");
        
        Carro c = new Carro();
        c.chassi = "A15A1S5V1SD21";
        c.cor = "Cor";
        c.marca = "Marca";
        c.modelo = "Modelo";
        c.qtPassageiros = 2;
        System.out.println(c.chassi + " - " + c.cor + " - " + c.marca);
    }
    
}
