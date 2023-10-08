package TiposDeDadosEVariaveis;

import java.util.Scanner;

public class CalculoProduto {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Insira o nome do Produto: ");
    String nomeDoProduto = teclado.nextLine();

    System.out.println("Qual o valor do produto?");
    double valorUnitarioProduto = teclado.nextDouble();

    System.out.println("quantos protudos deseja?");
    int quantidadeProduto = teclado.nextInt();

    double valorTotalProduto = valorUnitarioProduto * quantidadeProduto;

    System.out.println("O Produto: " + nomeDoProduto + " com o valor unitário: " + valorUnitarioProduto + " com a quantidade " + quantidadeProduto + " custará o valor total de $" + valorTotalProduto );

    teclado.close();
  }
}
