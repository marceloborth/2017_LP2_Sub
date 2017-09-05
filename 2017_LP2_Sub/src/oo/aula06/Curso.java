package oo.aula06;

public class Curso {
  //Atributos

  private String nome;
  private String area;
  private String resolucao;
  private String coordenador;
  private String inicio;
  private boolean status;

  //Construtor padrão

  public Curso() {
  }

  public Curso(String nome, String area, String resolucao, String coordenador, String inicio, boolean status) {
    this.nome = nome;
    this.area = area;
    this.resolucao = resolucao;
    this.coordenador = coordenador;
    this.inicio = inicio;
    this.status = status;
  }
  
  
  
  

  public Curso(String nome) {
    this.setNome(nome);
  }

  public Curso(String nome,
          String area) {
    this.setNome(nome);
    this.setArea(area);
  }

  //Métodos get e set
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getNome() {
    return this.nome;
  }

  public String getArea() {
    return this.area;
  }
}
