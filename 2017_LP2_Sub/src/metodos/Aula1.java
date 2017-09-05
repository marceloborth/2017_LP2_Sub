package metodos;

import javax.swing.JOptionPane;

public class Aula1 {

    public static void main(String[] args) {
        msg(); //1
        
        msg("Olá... tudo bem?"); //2
        msg("Oi"); //2
        
        int d = dobro(35); //3
        System.out.println("O dobro é " + d);
        
        double s = soma(10.0, 11.3); //4
        System.out.println("A soma é " + s);
    }
    
    //3 - Método com retorno e com parâmetro
    public static int dobro(int num) {
        int total = 2 * num;
        return total;
    }
    
    //4 - Método com retorno e com parâmetro
    public static double soma (double n1, double n2) {
        return n1 + n2;
    }
    
    //1 - Método sem retorno e sem parâmetro
    public static void msg() {
        JOptionPane.showMessageDialog(null, "Olá");
    }
    //2 - Método sem retorno e com parâmetro
    public static void msg(String t) {
        JOptionPane.showMessageDialog(null, t);
    }
    
}
