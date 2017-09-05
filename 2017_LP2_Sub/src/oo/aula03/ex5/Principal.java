/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo.aula03.ex5;

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.titular = "João";
        c1.agencia = "567-2";
        c1.conta = 12345;
        c1.limite = 1000.0;
        c1.abrirConta();//0
        
        c1.depositar(1000);
        c1.mostrarSaldo();//350
        c1.sacar(10000);
        c1.mostrarSaldo();//250
        c1.sacar(1500);
        c1.mostrarSaldo();
        
    }
}
