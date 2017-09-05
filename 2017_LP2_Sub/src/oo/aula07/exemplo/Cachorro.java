package oo.aula07.exemplo;

public class Cachorro {

    private String nome;
    private int idade;

    // Cachorro
    public Cachorro(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    // get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        if (idade < 0) {
            System.out.println("Idade inválida.");
        } else {
            this.idade = idade;
        }
    }

}
