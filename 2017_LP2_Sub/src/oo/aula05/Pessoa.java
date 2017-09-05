package oo.aula05;

import util.Validacao;

public class Pessoa {

    private String nome;
    private String cpf;// MUDAR DE int PARA String
    private String rg;
    private String nascimento;
    private boolean sexo;
    private String email;
    private String endereco;
    private Integer telefone;
    private Integer cep;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String rg, String nascimento,
            boolean sexo, String email, String endereco, Integer telefone,
            Integer cep) {
        setNome(nome);
        setCpf(cpf);
        setRg(rg);
        setNascimento(nascimento);
        setSexo(sexo);
        setEmail(email);
        setEndereco(endereco);
        setTelefone(telefone);
        setCep(cep);
    }

    public String getNome() {
        return nome;
    }

    /**
     * length: retorna a quantidade de caracteres da String
     */
    public void setNome(String nome) {
        //Verifica se o nome está completo, ou seja, no mínimo 2 nomes

        String[] qtNomes = nome.split(" "); //Quebra a partir do espaço
        if (qtNomes.length > 1) {
            this.nome = nome;
        } else {
            System.out.println("Informe seu nome completo.");
        }
    }

    //String getCpf
    public String getCpf() {
        return cpf;
    }

    //String cpf
    public void setCpf(String cpf) {

        boolean cpfValido = Validacao.isValidCPF(cpf);

        if (cpfValido) {
            this.cpf = cpf;
            System.out.println("CPF Válido...");
        } else {
            System.out.println("CPF Inválido...");
        }
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

}
