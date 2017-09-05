package oo.aula06.exemplo;

public class Oferta {

    private String turno;
    private String modalidade;

    //Criar construtor da classe
    public Oferta(String turno, String modalidade) {
        this.setTurno(turno);
        this.setModalidade(modalidade);
    }

    //get e set
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getModalidade() {
        return this.modalidade;
    }

}
