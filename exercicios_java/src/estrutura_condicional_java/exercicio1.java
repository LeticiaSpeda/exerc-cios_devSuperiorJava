package estrutura_condicional_java;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora;
        String nome;

        System.out.println("Qual o seu nome?");
        nome = sc.nextLine();
        System.out.println("Que horas são?");
        hora = sc.nextInt();

        if (hora <= 12 || hora <= 19) {
            System.out.println("Bom Dia " + nome);
        } else {
            System.out.println("Boa Tarde " + nome);
        } 
            
      

        sc.close();
    }
}
