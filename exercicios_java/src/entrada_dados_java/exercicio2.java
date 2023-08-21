package entrada_dados_java;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    
    int x;

    x = sc.nextInt();
    System.out.println("Você digitou: " + x);

    sc.close();

    }
}
