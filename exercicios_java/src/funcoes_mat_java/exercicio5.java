/*
 Fazer um programa para calcular o troco no processo de pagamento
  de um produto de uma mercearia. O programa deve ler o preço unitário 
  do produto, a quantidade de unidades compradas deste produto, 
  e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). 
  Seu programa deve mostrar o valor do troco a ser devolvido ao cliente.
 */

package funcoes_mat_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorProduto = sc.nextDouble();
        double quantidadeProduto = sc.nextDouble();
        double pagamentoCliente = sc.nextDouble();
        double valorTroco = (valorProduto * quantidadeProduto) - pagamentoCliente;

        Locale.setDefault(Locale.US);
        System.out.println("Preco unitario do produto: " + valorProduto);
        System.out.println("Quantidade da comprada: " + quantidadeProduto);
        System.out.println("Dinheiro recebido: " + pagamentoCliente);
        System.out.println("Troco: " + valorTroco);

        sc.close();
    }
}
