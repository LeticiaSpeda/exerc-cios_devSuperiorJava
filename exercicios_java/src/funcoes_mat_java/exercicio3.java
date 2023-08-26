/*
  Fazer um programa para ler as medidas da base e altura de um 
  retângulo. Em seguida, mostrar o valor da área, perímetro e 
  diagonal deste retângulo, com quatro casas decimais,conforme exemplos.
 */
package funcoes_mat_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double baseRetangulo = sc.nextDouble();
        double alturaRetangulo = sc.nextDouble();

        double area = baseRetangulo * alturaRetangulo;
        double perimetro = (baseRetangulo * 2) + (alturaRetangulo * 2);
        double calculo = (baseRetangulo * baseRetangulo) + (alturaRetangulo * alturaRetangulo);
        double diagonal = Math.sqrt(calculo);

        Locale.setDefault(Locale.US);
        System.out.println("Base do retangulo: " + baseRetangulo);
        System.out.println("Altura do retangulo: " + alturaRetangulo);

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Diagonal: " + diagonal);

        sc.close();
    }
}
