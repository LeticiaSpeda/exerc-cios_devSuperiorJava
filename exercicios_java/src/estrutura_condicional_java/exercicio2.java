/*
 Fazer um programa para ler as duas notas que um aluno obteve no 
 primeiro e segundo semestres de uma disciplina anual. Em seguida,
mostrar a nota final que o aluno obteve (com uma casa decimal) no ano 
juntamente com um texto explicativo. Caso a nota final do aluno
 seja inferior a 60.00, mostrar a mensagem "REPROVADO", conforme exemplos.
 */

package estrutura_condicional_java;
import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        System.out.println("Digite a primeira nota: ");
        double primeiraNota = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = sc.nextDouble();

        double notaFinal = primeiraNota + segundaNota;
        System.out.println("Sua nota final é: " + notaFinal);

        if (notaFinal <=60) {
            System.out.println("Reprovado");
        }
        
        sc.close();
    }
}
