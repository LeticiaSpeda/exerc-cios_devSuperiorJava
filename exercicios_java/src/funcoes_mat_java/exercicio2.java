/*
 Fazer um programa para ler as medidas da largura e comprimento 
 de um terreno retangular com uma casa decimal, bem como o valor 
 do metro quadrado do terreno com duas casas decimais. Em seguida, 
 o programa deve mostrar o valor da área do terreno, bem como o 
 valor do preço do terreno, ambos com duas casas decimais, conforme
 exemplo.
 */
package funcoes_mat_java;
import java.util.Scanner;

 public class exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double valorMetro2 = sc.nextDouble();

        double areaTerreno = largura * comprimento;
        double precoTerreno = valorMetro2 * areaTerreno;

        System.out.println("Digite a largura do terreno:");
        System.out.println(largura);

        System.out.println("Digite o comprimento do terreno: ");
        System.out.println(comprimento);

        System.out.println("Digite o valor do metro quadrado: ");
        System.out.println(valorMetro2);

        System.out.println("Area do terreno é: " + areaTerreno);
        System.out.println("Preco do terreno é: " + precoTerreno);

        sc.close();
    }
 }