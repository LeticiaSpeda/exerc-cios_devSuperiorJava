/*Fazer um programa para ler os três coeficientes de uma equação
 do segundo grau. Usando a fórmula de Baskara, calcular e mostrar 
 os valores das raízes x1 e x2 da equação com quatro casas decimais, 
 conforme exemplo. Se a equação não possuir raízes reais, mostrar uma
mensagem.*/

package estrutura_condicional_java;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.println("Digite o primeiro numero: ");
        a = sc.nextDouble();

        System.out.println("Digite o segundo numero: ");
        b = sc.nextDouble();

        System.out.println("Digite o terceiro numero: ");
        c = sc.nextDouble();


        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equacao nao possui numeros reais ");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A equacao possui uma raiz real: x =  " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        sc.close();
    }
}
