package oo.aula06.exemplo;

public class Principal {

  public static void main(String[] args) {
    Oferta o = new Oferta("Noturno",
            "Subsequente");

    System.out.println("Turno: "
            + o.getTurno());
    System.out.println("Modalidade: "
            + o.getModalidade());

  }

}
