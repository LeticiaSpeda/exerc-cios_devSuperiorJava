package entrada_dados_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        char x;
        x = sc.next().charAt(0);

        System.out.println("Voce digitou: " + x);

        sc.close();
    }
}
