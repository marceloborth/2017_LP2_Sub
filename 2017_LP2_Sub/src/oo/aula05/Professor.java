package oo.aula05;

public class Professor {

    private String area;
    private String formacao;
    private Boolean status;

    public String toString() {
        String txt = "Área: " + this.area + "\n"
                + "Formação: " + this.formacao + "\n"
                + "Status: " + this.status;

        return txt;
    }

    // Métodos get e set (ENCAPSULAMENTO)
    //this->Se refere a um atributo/método da própria classe
    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFormacao() {
        return this.formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Boolean isStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
