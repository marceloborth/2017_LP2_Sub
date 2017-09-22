package excecoes;

public class ExemploDeErros {

    public static void main(String[] args) {

        try {
            //Double a = Double.parseDouble("abc"); //NumberFormatException
            
            int total = 110 / 0; //ArithmeticException
            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro não esperado.\n"
                    + "Contate o suporte do sistema.");
        }

    }

}
