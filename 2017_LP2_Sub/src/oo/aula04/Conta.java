package oo.aula04;

public class Conta {

    private String titular;
    private int conta;
    private Double saldo;
    private boolean ativo; //ativo ou inativo
    
    
    //get e set
    //GET: Vai retornar o valor do atributo
    //Vai retornar algo
    //Não recebe parâmetro
    public String getTitular() {
        return titular;
    }

    //SET: Vai setar o valor do atributo
    //Não retornada nada, ou seja, é void
    //Receba o valor para alterar por parâmetro
    public void setTitular(String novoTitular) {
        titular = novoTitular;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int novaConta) {
        conta = novaConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        //"this" refere-se a elementos da própria classe 
        //(atributos ou métodos)
        this.saldo = saldo;
    }
    
    //Usar "is" quando for boolean
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
}
