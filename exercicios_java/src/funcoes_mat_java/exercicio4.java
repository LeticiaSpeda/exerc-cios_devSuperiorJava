/*
 Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar 
 na tela o valor da soma destes números.
 */

package funcoes_mat_java;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int soma = x + y;

        System.out.println("Digite o valor de X: " + x);
        System.out.println("Digite o valor de X: " + y);

        System.out.println("A soma dos valores é: " + soma);

        sc.close();
    }
}
