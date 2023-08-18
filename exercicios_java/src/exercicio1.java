import java.util.Locale;

public class exercicio1 {
    public static void main (String[] args) throws Exception {
        int y = 32;
        double x = 10.35784;

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US); //alterar para ponto ou virgula
        System.out.printf("RESULTADO = "+ x + "METROS");
        System.out.printf("RESULTADO = %.2F metros%n", x);
    }
}