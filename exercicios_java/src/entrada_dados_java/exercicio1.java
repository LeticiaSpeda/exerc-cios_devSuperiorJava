package entrada_dados_java;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();

        System.out.println("Você digitou: " + x);

        sc.close();
    }
}
