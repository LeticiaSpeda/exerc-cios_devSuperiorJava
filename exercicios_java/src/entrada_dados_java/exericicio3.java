package entrada_dados_java;
import java.util.Locale;
import java.util.Scanner;

public class exericicio3 {
    
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);    
    
    double x;

    x = sc.nextDouble();

    System.out.println("Você digitou: " + x);
    sc.close();
    }
}
