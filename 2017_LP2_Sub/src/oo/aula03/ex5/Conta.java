package oo.aula03.ex5;

public class Conta {
    String titular;
    String agencia;
    int conta;
    Double saldo;
    Double limite;
    
    void abrirConta(){
        saldo = 0.0;
    }
    void depositar(double valor) {
        saldo = saldo + valor;
    }
    void sacar(double valor) {
        double limiteTotal = saldo + limite;
        
        if (valor > limiteTotal) {
            System.out.println("O valor informado ultrapassou o limite que é " + limiteTotal);
        } else {
            saldo = saldo - valor; //saque realizado
        }
    }
    
    void mostrarSaldo() {
        System.out.println("Seu saldo é " + saldo);
    }
}
