package conversao;

public class ConversaoDeDados {
    
    public static void main(String[] args) {
        
        Integer a = Integer.parseInt("100");
        Float b = Float.parseFloat("130.22");
        Double c = Double.parseDouble("1250.30");
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        String x = "100";
        Integer d = Integer.parseInt(x);
        System.out.println(d);
        
    }
    
}
