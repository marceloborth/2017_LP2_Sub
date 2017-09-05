package oo.aula06.estatico;

//static
public class Pessoa {
  
  public static int contador = 0;
  private String nome;

  public Pessoa() {
    contador++;
  }

  public Pessoa(String nome) {
    this.nome = nome;
    contador++;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getNome() {
    return this.nome;
  }
  
}
